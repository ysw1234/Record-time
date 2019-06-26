package com.qfedu.vo;

import com.qfedu.pojo.Ariticle;
import com.qfedu.pojo.User;

import java.util.List;

/**
 * Created by Winchester on 2019/6/24.
 */
public class UserVo extends User {


    private Ariticle ariticle;

    public Ariticle getAriticle() {
        return ariticle;
    }

    public void setAriticle(Ariticle ariticle) {
        this.ariticle = ariticle;
    }

    @Override
    public String toString() {
        return "UserVo{" +
                "ariticle=" + ariticle +
                '}';
    }
}
