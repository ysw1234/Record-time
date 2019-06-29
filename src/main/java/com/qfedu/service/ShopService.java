package com.qfedu.service;

import com.qfedu.pojo.ShopTopPic;
import com.qfedu.pojo.Slideshow;
import com.qfedu.vo.CommodityVo;

import java.util.List;
import java.util.Map;

/**
 * Created by Winchester on 2019/6/26.
 */
public interface ShopService {
    List<ShopTopPic> selectShoptoppic();


    Map<String,Object> findByPage(Integer page, Integer limit);

    CommodityVo selectDetailById(Integer id);

    List<Slideshow> selectSlideshow();

    CommodityVo selectCommodityById(Integer id);
}
