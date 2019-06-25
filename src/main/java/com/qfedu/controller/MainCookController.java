package com.qfedu.controller;

import com.qfedu.pojo.CookBook;
import com.qfedu.pojo.MainCook;
import com.qfedu.service.MainCookService;
import com.qfedu.vo.JsonBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/maincook")
public class MainCookController {

    @Autowired
    private MainCookService mainCookService;

    @RequestMapping("/findMainCook")
    public JsonBean findMainCook(){
        List<MainCook> list = mainCookService.findMainCook();
        return new JsonBean(1,list);
    }

    @RequestMapping("/mainCook.do")
    public JsonBean findCookIntroduce(Integer id){
        List<MainCook> list = mainCookService.findCookIntroduce(id);
        return new JsonBean(1,list);
    }


}