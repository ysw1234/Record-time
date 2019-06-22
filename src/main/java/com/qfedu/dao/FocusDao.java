package com.qfedu.dao;

import com.qfedu.pojo.User;

import java.util.List;

/**
 * Created by Winchester on 2019/6/22.
 */
public interface FocusDao {
    List<User> selectAllUser();
}
