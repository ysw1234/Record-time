package com.qfedu.service.impl;

import com.qfedu.dao.ShopDao;
import com.qfedu.pojo.ShopTopPic;
import com.qfedu.service.ShopService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

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
}
