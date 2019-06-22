package com.qfedu.dao;

import com.qfedu.pojo.User;
import org.apache.ibatis.annotations.Param;

/**
 * Created by Administrator on 2019/6/21 0021.
 */
public interface UserDao {
    User findUser(@Param("username") String username, @Param("password") String password);

    User findUserByName(String username);

    void registerUser(User user);
}
