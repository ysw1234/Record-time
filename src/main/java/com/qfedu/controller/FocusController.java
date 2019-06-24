package com.qfedu.controller;

import com.qfedu.pojo.User;
import com.qfedu.service.FocusService;
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
    public List<User> focusMenu(HttpServletRequest request){
        User user = (User) request.getSession().getAttribute("user");
        List<User> list = focusService.selectAllUser(user.getId());
        return list;
    }

    @RequestMapping("/addFocus.do")
    public String addFocus(String[] ids,HttpServletRequest request){
        User user = (User) request.getSession().getAttribute("user");
        focusService.addFocus(user.getId(),ids);
        return "redirect:/afterFocus.html";
    }

}
