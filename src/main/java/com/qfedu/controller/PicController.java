package com.qfedu.controller;

import com.qfedu.pojo.Pic;
import com.qfedu.service.PicService;
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
    public List<Pic> picShow(){
        List<Pic> list = picService.findPicShow();
        return list;
    }
}