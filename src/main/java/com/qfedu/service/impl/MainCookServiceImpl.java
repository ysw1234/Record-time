package com.qfedu.service.impl;

import com.qfedu.dao.MainCookDao;
import com.qfedu.pojo.CookBook;
import com.qfedu.pojo.MainCook;
import com.qfedu.service.MainCookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Service
public class MainCookServiceImpl implements MainCookService {

    @Autowired
    private MainCookDao mainCookDao;


    @Override
    public List<MainCook> findMainCook() {
        return mainCookDao.findMainCook();
    }

    @Override
    public List<MainCook> findCookIntroduce(Integer id) {
        return mainCookDao.findCookIntroduce(id);
    }
}