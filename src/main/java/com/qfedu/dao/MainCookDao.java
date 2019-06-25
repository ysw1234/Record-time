package com.qfedu.dao;

import com.qfedu.pojo.CookBook;
import com.qfedu.pojo.MainCook;

import java.util.List;

/**
 * Created by Administrator on 2019/6/25 0025.
 */
public interface MainCookDao {
    List<MainCook> findMainCook();

    List<MainCook> findCookIntroduce(Integer id);
}
