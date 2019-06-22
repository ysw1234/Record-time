package com.qfedu.controller;

import com.qfedu.pojo.CookBook;
import com.qfedu.service.CookBookService;
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
    public List<CookBook> findCook(){
        List<CookBook> list = cookBookService.findCook();
        return list;
    }
}