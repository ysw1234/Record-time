package com.qfedu.service.impl;

import com.qfedu.dao.TitleDao;
import com.qfedu.pojo.Title;
import com.qfedu.service.TitleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Service
public class TitleServiceImpl implements TitleService {

    @Autowired
    private TitleDao titleDao;


    @Override
    public List<Title> findTitle() {
        return titleDao.findAllTitle();
    }
}