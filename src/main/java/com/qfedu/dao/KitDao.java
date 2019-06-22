package com.qfedu.dao;

import com.qfedu.pojo.Kit;

import java.util.List;

/**
 * Created by Administrator on 2019/6/22 0022.
 */
public interface KitDao {

    List<Kit> findKitList();
}