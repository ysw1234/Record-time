package com.qfedu.service.impl;

import com.qfedu.dao.FocusDao;
import com.qfedu.pojo.Ariticle;
import com.qfedu.pojo.User;
import com.qfedu.service.FocusService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by Winchester on 2019/6/22.
 */
@Service
public class FocusServiceImpl implements FocusService {

    @Autowired
    private FocusDao focusDao;


    @Override
    public List<User> selectAllUser(Integer id) {
        return focusDao.selectAllUser(id);
    }

    @Override
    public void addFocus(Integer uid,String[] ids) {
        for (String id:ids) {
            focusDao.addFocus(uid,Integer.parseInt(id));
        }
    }

    @Override
    public List<Ariticle> selectAllAriticle(Integer id) {
        return null;
    }
}
