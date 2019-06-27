package com.qfedu.service.impl;

import com.qfedu.dao.ClassifyDao;
import com.qfedu.pojo.Classify;
import com.qfedu.service.ClassifyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClassifyServiceImpl implements ClassifyService {
    @Autowired
    private ClassifyDao classifyDao;


    @Override
    public List<Classify> findClassify() {
        return classifyDao.findClassify();
    }
}