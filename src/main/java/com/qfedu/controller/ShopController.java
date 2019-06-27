package com.qfedu.controller;

import com.qfedu.pojo.ShopTopPic;
import com.qfedu.service.ShopService;
import com.qfedu.vo.JsonBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * Created by Winchester on 2019/6/26.
 */
@Controller
public class ShopController {

    @Autowired
    private ShopService shopService;


    @RequestMapping("/shoptoppic.do")
    @ResponseBody
    public JsonBean selectShoptoppic(){
        List<ShopTopPic> list = shopService.selectShoptoppic();
        return new JsonBean(1,list);
    }

}
