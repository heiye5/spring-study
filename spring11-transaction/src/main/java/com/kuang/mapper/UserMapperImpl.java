package com.kuang.mapper;

import com.kuang.pojo.User;
import org.mybatis.spring.SqlSessionTemplate;
import org.mybatis.spring.support.SqlSessionDaoSupport;

import java.util.List;

public class UserMapperImpl extends SqlSessionDaoSupport implements UserMapper{

    public List<User> selectUser() {
        User user = new User(6, "小王", "242345");

        UserMapper mapper = getSqlSession().getMapper(UserMapper.class);

        mapper.addtUser(user);
        mapper.deleteUser(6);

        return mapper.selectUser();
    }

    public int addtUser(User user) {
        return getSqlSession().getMapper(UserMapper.class).addtUser(user);
    }

    public int deleteUser(int id) {
        return getSqlSession().getMapper(UserMapper.class).deleteUser(id);
    }
}
