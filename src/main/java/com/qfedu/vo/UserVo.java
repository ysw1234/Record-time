package com.qfedu.vo;

import com.qfedu.pojo.Ariticle;
import com.qfedu.pojo.User;

import java.util.List;

/**
 * Created by Winchester on 2019/6/24.
 */
public class UserVo extends User {


    private List<Ariticle>  ariticleList;

    public List<Ariticle> getAriticleList() {
        return ariticleList;
    }

    public void setAriticleList(List<Ariticle> ariticleList) {
        this.ariticleList = ariticleList;
    }
}
