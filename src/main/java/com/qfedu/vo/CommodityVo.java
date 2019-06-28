package com.qfedu.vo;

import com.qfedu.pojo.Commodity;
import com.qfedu.pojo.User;

/**
 * Created by Winchester on 2019/6/27.
 */
public class CommodityVo extends Commodity {

    private User user;

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
