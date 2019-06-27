package com.qfedu.service.impl;

import com.qfedu.dao.PabulumDao;
import com.qfedu.pojo.Pabulum;
import com.qfedu.service.PabulumService;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PabulumServiceImpl implements PabulumService {

    @Autowired
    private PabulumDao pabulumDao;
    @Override
    public List<Pabulum> findPabulum(@Param("id") Integer id, @Param("tid") Integer tid) {
        return pabulumDao.findPabulum(id,tid);
    }
}