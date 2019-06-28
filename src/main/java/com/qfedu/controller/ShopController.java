package com.qfedu.controller;

import com.qfedu.pojo.Commodity;
import com.qfedu.pojo.ShopTopPic;
import com.qfedu.service.ShopService;
import com.qfedu.vo.CommodityVo;
import com.qfedu.vo.JsonBean;
import org.apache.shiro.authz.annotation.RequiresUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;
import java.util.Map;

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

    @RequestMapping("/selectAllCommodity.do")
    @ResponseBody
    public JsonBean selectAllCommodity(Integer page,Integer limit){
        Map<String,Object> map = shopService.findByPage(page,limit);
        return new JsonBean(1,map);
    }



}
