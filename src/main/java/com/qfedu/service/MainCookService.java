package com.qfedu.service;

import com.qfedu.pojo.CookBook;
import com.qfedu.pojo.MainCook;

import java.util.List;

/**
 * Created by Administrator on 2019/6/25 0025.
 */
public interface MainCookService {
    List<MainCook> findMainCook(Integer id);

    List<MainCook> findCookIntroduce(Integer id);
}
