package com.qfedu.service.impl;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.qfedu.dao.ShopDao;
import com.qfedu.pojo.ShopTopPic;
import com.qfedu.pojo.Slideshow;
import com.qfedu.service.ShopService;
import com.qfedu.vo.CommodityVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by Winchester on 2019/6/26.
 */
@Service
public class ShopServiceImpl implements ShopService {

    @Autowired
    private ShopDao shopDao;

    @Override
    public List<ShopTopPic> selectShoptoppic() {
        return shopDao.selectShoptoppic();
    }

    @Override
    public Map<String, Object> findByPage(Integer page, Integer limit) {
        PageHelper.startPage(page,limit);
        List<CommodityVo> list = shopDao.selectAllCommodity();
        System.out.println("++++++++"+list);
        long total = ((Page) list).getTotal();
        int pages = ((Page) list).getPages();
        Map<String,Object> map = new HashMap<>();
        map.put("total",total);
        map.put("totalPage",pages);
        map.put("pageList",list);
        map.put("currentPage",page);
        return map;
    }

    @Override
    public CommodityVo selectDetailById(Integer id) {
        return shopDao.selectDetailById(id);
    }

    @Override
    public List<Slideshow> selectSlideshow() {
        return shopDao.selectSlideshow();
    }


}
