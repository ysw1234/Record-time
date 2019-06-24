package com.qfedu.controller;

import com.qfedu.pojo.Pic;
import com.qfedu.service.PicService;
import com.qfedu.vo.JsonBean;
import com.qiniu.util.Json;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/pic")
public class PicController {

    @Autowired
    private PicService picService;

    @RequestMapping("/picshow.do")
    public JsonBean picShow(){
        List<Pic> list = picService.findPicShow();
        return new JsonBean(1,list);
    }

    @RequestMapping("/cookshow.do")
    public JsonBean cookShow(){
        List<Pic> list = picService.findCookShow();
        return new JsonBean(1,list);
    }
}