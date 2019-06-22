package com.qfedu.service.impl;


import com.qfedu.dao.CookBookDao;
import com.qfedu.pojo.CookBook;
import com.qfedu.service.CookBookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CookBookServiceImpl implements CookBookService {

    @Autowired
    private CookBookDao cookBookDao;

    @Override
    public List<CookBook> findCook() {
        return cookBookDao.findCook();
    }
}