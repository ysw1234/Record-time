package com.qfedu.controller;

import com.qfedu.pojo.Title;
import com.qfedu.service.TitleService;
import com.qfedu.vo.JsonBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/title")
public class TitleController {

    @Autowired
    private TitleService titleService;

    @RequestMapping("/findtitle.do")
    public JsonBean findTitle(){
        List<Title> list = titleService.findTitle();
        return new JsonBean(1,list);
    }


}