package com.qfedu.service;

import com.qfedu.pojo.Ariticle;
import com.qfedu.pojo.User;

import java.util.List;

/**
 * Created by Winchester on 2019/6/22.
 */
public interface FocusService {
    List<User> selectAllUser(Integer id);

    void addFocus(Integer id,String[] ids);

    List<Ariticle> selectAllAriticle(Integer id);
}
