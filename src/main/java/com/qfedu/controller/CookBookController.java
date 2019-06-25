package com.qfedu.controller;

import com.qfedu.pojo.CookBook;
import com.qfedu.service.CookBookService;
import com.qfedu.vo.JsonBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/cookBook")
public class CookBookController {

    @Autowired
    private CookBookService cookBookService;

    @RequestMapping("/cookBookList.do")
    public JsonBean findCook(){
        List<CookBook> list = cookBookService.findCook();
        return new JsonBean(1,list);
    }

    @RequestMapping("/cookBookMain.do")
    public JsonBean findMain(Integer id){
        List<CookBook> list = cookBookService.findMain(id);
        return new JsonBean(1,list);
    }




}