package com.qfedu.controller;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.gson.JsonArray;
import com.qfedu.pojo.Ariticle;
import com.qfedu.pojo.Cpic;
import com.qfedu.pojo.User;
import com.qfedu.service.FocusService;
import com.qfedu.vo.JsonBean;
import com.qfedu.vo.UserVo;
import com.qiniu.util.Json;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

/**
 * Created by Winchester on 2019/6/22.
 */
@Controller
public class FocusController {


    @Autowired
    private FocusService focusService;

    @RequestMapping("/focusMenu.do")
    @ResponseBody
    public JsonBean focusMenu(Integer id,HttpServletRequest request){
        User user = (User) request.getSession().getAttribute("user");
        System.out.println("++++++++"+id);
        List<User> list = focusService.selectAllUser(id);
        return new JsonBean(1,list);
    }

    @RequestMapping("/addFocus.do")
    @ResponseBody
    public JsonBean addFocus(Integer id, HttpServletRequest request){
        //System.out.println(Arrays.toString(ids));
        String ids = request.getParameter("ids");
        System.out.println(ids);
        ObjectMapper mapper = new ObjectMapper();
        User user = (User) request.getSession().getAttribute("user");
        //focusService.addFocus(id,ids);
        return new JsonBean(1,"添加关注成功");
    }

    @RequestMapping("/ariticle.do")
    @ResponseBody
    public JsonBean selectAllAriticle(Integer page,Integer limit,Integer id,HttpServletRequest request){
        //User user = (User) request.getSession().getAttribute("user");
        //Integer id = user.getId();
        //List<UserVo> list = focusService.selectAllAriticle(id);
        Map<String,Object> map = focusService.selectAllAriticleByPage(id,page,limit);
        return new JsonBean(1,map);
    }

    @RequestMapping("/selectCPic.do")
    @ResponseBody
    public JsonBean selectCPic(){
        List<Cpic> list = focusService.selectCPic();
        return new JsonBean(1,list);
    }

    @RequestMapping("/cariticle.do")
    @ResponseBody
    public JsonBean selectCAriticle(Integer page,Integer limit,Integer id,HttpServletRequest request){
        //User user = (User) request.getSession().getAttribute("user");
        //Integer id = user.getId();
        //List<UserVo> list = focusService.selectAllAriticle(id);
        Map<String,Object> map = focusService.selectAllAriticleByPage(id,page,limit);
        return new JsonBean(1,map);
    }
}
