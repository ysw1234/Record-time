package com.qfedu.dao;

import com.qfedu.pojo.Collect;

import java.util.List;

/**
 * Created by Administrator on 2019/6/26 0026.
 */
public interface CollectDao {

    List<Collect> findCollect();

    List<Collect> findAll(Integer id);
}