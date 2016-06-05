package com.cym.demo.dao;

import com.cym.demo.model.User;
import com.cym.demo.model.User1;

import java.util.List;
import java.util.Map;

public interface UserMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(User record);

    int insertSelective(User record);

    User selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(User record);

    int updateByPrimaryKey(User record);

    public List<User> selectUser(Integer userId);

    public List<Map<String, Object>> getMaplist();

    User1 selectByPrimaryKey1(Integer id);
}