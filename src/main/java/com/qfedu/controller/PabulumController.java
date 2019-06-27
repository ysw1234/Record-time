package com.qfedu.controller;

import com.qfedu.pojo.Pabulum;
import com.qfedu.service.PabulumService;
import com.qfedu.vo.JsonBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/pabulum")
public class PabulumController {

    @Autowired
    private PabulumService pabulumService;

    @RequestMapping("/findPabulum.do")
    public JsonBean findPabulum(Integer id,Integer tid){
        List<Pabulum> list = pabulumService.findPabulum(id,tid);
        return new JsonBean(1,list);
    }
}