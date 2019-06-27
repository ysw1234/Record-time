package com.qfedu.service.impl;

import com.qfedu.dao.CollectDao;
import com.qfedu.pojo.Collect;
import com.qfedu.service.CollectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CollectServiceImpl implements CollectService {

    @Autowired
    private CollectDao collectDao;

    @Override
    public List<Collect> findCollect() {
        return collectDao.findCollect();
    }

    @Override
    public List<Collect> findAll(Integer id) {
        return collectDao.findAll(id);
    }
}