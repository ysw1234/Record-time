package com.qfedu.dao;

import com.qfedu.pojo.CookBook;

import java.util.List;

/**
 * Created by Administrator on 2019/6/22 0022.
 */
public interface CookBookDao {
    List<CookBook> findCook();
}
