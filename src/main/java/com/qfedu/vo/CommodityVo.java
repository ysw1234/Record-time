package com.qfedu.vo;

import com.qfedu.pojo.Color;
import com.qfedu.pojo.Commodity;
import com.qfedu.pojo.User;

import java.util.List;

/**
 * Created by Winchester on 2019/6/27.
 */
public class CommodityVo extends Commodity {

    private User user;
    private String c_comm;
    private List<Color> colorList;

    public List<Color> getColorList() {
        return colorList;
    }

    public void setColorList(List<Color> colorList) {
        this.colorList = colorList;
    }

    public String getC_comm() {
        return c_comm;
    }

    public void setC_comm(String c_comm) {
        this.c_comm = c_comm;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }



}
