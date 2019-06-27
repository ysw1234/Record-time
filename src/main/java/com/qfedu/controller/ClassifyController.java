package com.qfedu.controller;

import com.qfedu.pojo.Classify;
import com.qfedu.pojo.Pic;
import com.qfedu.service.ClassifyService;
import com.qfedu.vo.JsonBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/classify")
public class ClassifyController {

    @Autowired
    private ClassifyService classifyService;

    @RequestMapping("/caneat.do")
    public JsonBean findClassify(){
        List<Classify> list = classifyService.findClassify();
        return new JsonBean(1,list);
    }
}