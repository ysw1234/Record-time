package com.qfedu.controller;

import com.qfedu.pojo.Kit;
import com.qfedu.service.KitService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/kit")
public class KitController {

    @Autowired
    private KitService kitService;

    @RequestMapping("/kitlist.do")
    public List<Kit> findKitList(){
        List<Kit> list = kitService.findKitList();
        return list;
    }
}