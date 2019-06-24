package com.qfedu.controller;

import com.qfedu.pojo.Ariticle;
import com.qfedu.pojo.User;
import com.qfedu.service.FocusService;
import com.qfedu.vo.JsonBean;
import com.qiniu.util.Json;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

/**
 * Created by Winchester on 2019/6/22.
 */
@Controller
public class FocusController {


    @Autowired
    private FocusService focusService;

    @RequestMapping("/focusMenu.do")
    @ResponseBody
    public JsonBean focusMenu(Integer id,HttpServletRequest request){
        User user = (User) request.getSession().getAttribute("user");
        System.out.println("++++++++"+id);
        List<User> list = focusService.selectAllUser(id);
        return new JsonBean(1,list);
    }

    @RequestMapping("/addFocus.do")
    @ResponseBody
    public JsonBean addFocus(String[] ids, HttpServletRequest request){
        User user = (User) request.getSession().getAttribute("user");
        focusService.addFocus(user.getId(),ids);
        return new JsonBean(1,"添加关注成功");
    }

    @RequestMapping("/ariticle.do")
    @ResponseBody
    public JsonBean selectAllAriticle(HttpServletRequest request){
        User user = (User) request.getSession().getAttribute("user");
        Integer id = user.getId();
        List<Ariticle> list = focusService.selectAllAriticle(id);
        return new JsonBean(1,list);
    }

}
