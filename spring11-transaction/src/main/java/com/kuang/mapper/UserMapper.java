package com.kuang.mapper;

import com.kuang.pojo.User;

import java.util.List;

public interface UserMapper {
    List<User> selectUser();

    //添加用户
    int addtUser(User user);

    //删除用户
    int deleteUser(int id);
}
