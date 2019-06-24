package com.qfedu.service;


import com.qfedu.pojo.CookBook;

import java.util.List;

public interface CookBookService {
    List<CookBook> findCook();

    List<CookBook> findMain(Integer id);

    List<CookBook> findMainCook();

    List<CookBook> findCookIntroduce(Integer id);
}
