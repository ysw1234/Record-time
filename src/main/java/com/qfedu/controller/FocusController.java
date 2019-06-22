package com.qfedu.controller;

import com.qfedu.pojo.User;
import com.qfedu.service.FocusService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

/**
 * Created by Winchester on 2019/6/22.
 */
@Controller
public class FocusController {


    @Autowired
    private FocusService focusService;

    @RequestMapping("/focusMenu")
    public List<User> focusMenu(){
        List<User> list = focusService.selectAllUser();
        return list;
    }

}
