package com.qfedu.service;

import com.qfedu.pojo.Ariticle;
import com.qfedu.pojo.Cpic;
import com.qfedu.pojo.User;
import com.qfedu.vo.UserVo;

import java.util.List;
import java.util.Map;

/**
 * Created by Winchester on 2019/6/22.
 */
public interface FocusService {
    List<User> selectAllUser(Integer id);

    void addFocus(Integer id,String[] ids);

    List<UserVo> selectAllAriticle(Integer id);

    Map<String,Object> selectAllAriticleByPage(Integer id, Integer page, Integer limit);

    List<Cpic> selectCPic();
}
