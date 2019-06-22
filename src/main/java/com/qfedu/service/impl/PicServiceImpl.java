package com.qfedu.service.impl;


import com.qfedu.dao.PicDao;
import com.qfedu.pojo.Pic;
import com.qfedu.service.PicService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PicServiceImpl implements PicService {

    @Autowired
    private PicDao picDao;
    @Override
    public List<Pic> findPicShow() {
        return picDao.findPicShow();
    }

    @Override
    public List<Pic> findCookShow() {
        return picDao.findCookShow();
    }
}