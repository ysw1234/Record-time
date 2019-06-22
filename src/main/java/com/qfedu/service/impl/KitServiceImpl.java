package com.qfedu.service.impl;

import com.qfedu.dao.KitDao;
import com.qfedu.pojo.Kit;
import com.qfedu.service.KitService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class KitServiceImpl implements KitService {

    @Autowired
    private KitDao kitDao;


    @Override
    public List<Kit> findKitList() {
        return kitDao.findKitList();
    }
}