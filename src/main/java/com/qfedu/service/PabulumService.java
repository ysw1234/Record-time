package com.qfedu.service;

import com.qfedu.pojo.Pabulum;

import java.util.List;

/**
 * Created by Administrator on 2019/6/27 0027.
 */
public interface PabulumService {
    List<Pabulum> findPabulum(Integer id, Integer tid);
}
