package com.qfedu.controller;

import com.qfedu.pojo.Collect;
import com.qfedu.service.CollectService;
import com.qfedu.vo.JsonBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/collect")
public class CollectController {

    @Autowired
    private CollectService collectService;

    @RequestMapping("/collectList.do")
    public JsonBean findCollect(){
        List<Collect> list = collectService.findCollect();
        return new JsonBean(1,list);
    }

    @RequestMapping("/collectAll.do")
    public JsonBean findAll(Integer id){
        List<Collect> list = collectService.findAll(id);
        return new JsonBean(1,list);
    }
}