package com.qfedu.dao;

import com.qfedu.pojo.ShopTopPic;
import com.qfedu.vo.CommodityVo;

import java.util.List;

/**
 * Created by Winchester on 2019/6/26.
 */
public interface ShopDao {
    List<ShopTopPic> selectShoptoppic();

    List<CommodityVo> selectAllCommodity();
}