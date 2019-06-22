package com.qfedu.controller;

import com.qfedu.pojo.User;
import com.qfedu.service.UserService;
import com.qfedu.vo.JsonBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping("/login.do")
    public JsonBean login(String username,String password){
        User user = userService.findUser(username,password);
        if(user != null){
            return new JsonBean(1,user);
        }else {
            return new JsonBean(0,"登录名或密码错误");
        }

    }


    @RequestMapping("/register.do")
    public JsonBean registerUser(User user){
        String username = user.getUsername();
        User user1 = userService.findUserByName(username);
        if(user1 != null){
            return new JsonBean(0,"该用户名已存在");
        }else {
            user.setFanscount(100);
            user.setFocuscount(10);
            user.setHeadphoto("http://ptci3oe9g.bkt.clouddn.com/u=105201544,868720712&fm=26&gp=0.jpg");
            userService.registerUser(user);
            return new JsonBean(1,"注册成功");
        }

    }


}