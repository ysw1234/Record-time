package com.qfedu.dao;

import com.qfedu.pojo.User;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * Created by Winchester on 2019/6/22.
 */
public interface FocusDao {
    List<User> selectAllUser(Integer id);

    void addFocus(@Param("uid") Integer uid,@Param("id") Integer id);
}
