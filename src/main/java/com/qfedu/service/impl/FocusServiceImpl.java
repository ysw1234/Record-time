package com.qfedu.service.impl;

import com.qfedu.dao.FocusDao;
import com.qfedu.pojo.User;
import com.qfedu.service.FocusService;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by Winchester on 2019/6/22.
 */
@Service
public class FocusServiceImpl implements FocusService {

    private FocusDao focusDao;


    @Override
    public List<User> selectAllUser() {
        return focusDao.selectAllUser();
    }
}
