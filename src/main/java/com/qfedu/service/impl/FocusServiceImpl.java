package com.qfedu.service.impl;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.qfedu.dao.FocusDao;
import com.qfedu.pojo.Ariticle;
import com.qfedu.pojo.Cpic;
import com.qfedu.pojo.User;
import com.qfedu.service.FocusService;
import com.qfedu.vo.UserVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by Winchester on 2019/6/22.
 */
@Service
public class FocusServiceImpl implements FocusService {

    @Autowired
    private FocusDao focusDao;


    @Override
    public List<User> selectAllUser(Integer id) {
        return focusDao.selectAllUser(id);
    }

    @Override
    public void addFocus(Integer uid,char[] ids) {
        for (char id:ids) {
            focusDao.addFocus(uid,Integer.parseInt(id+""));
        }
    }



    @Override
    public List<UserVo> selectAllAriticle(Integer id) {
        return focusDao.selectAllAriticle(id);
    }

    @Override
    public Map<String, Object> selectAllAriticleByPage(Integer id, Integer page, Integer limit) {

        PageHelper.startPage(page,5);
        List<UserVo> list = focusDao.selectAllAriticle(id);
        System.out.println("++++++"+list);
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
    public List<Cpic> selectCPic() {

        return focusDao.selectCPic();
    }
}
