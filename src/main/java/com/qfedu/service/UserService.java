package com.qfedu.service;

import com.qfedu.pojo.User;

/**
 * Created by Administrator on 2019/6/21 0021.
 */
public interface UserService {
    User findUser(String username, String password);

    User findUserByName(String username);

    void registerUser(User user);
}
