package com.cym.demo.service;

import java.util.List;
import java.util.Map;

import com.cym.demo.dao.UserMapper;
import com.cym.demo.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service("userService")
public class UserServiceImpl implements UserServiceI {
    private UserMapper userMapper;

    public UserMapper getUserMapper() {
        return userMapper;
    }
    @Autowired
    public void setUserMapper(UserMapper userMapper) {
        this.userMapper = userMapper;
    }

    @Override
    public User getUserById(Integer id) {
        return userMapper.selectByPrimaryKey(id);
    }

    @Override
    public int addUser(User record) {
        return userMapper.insert(record);
    }

    @Override
    public int updateUser(User record) {
        return userMapper.updateByPrimaryKey(record);
    }

    @Override
    public int delUserById(Integer id) {
        return userMapper.deleteByPrimaryKey(id);
    }

    @Override
    public List<User> selectUser(Integer userId) {
        return userMapper.selectUser(userId);
    }

    @Override
    public List<Map<String, Object>> getMaplist() {
        return userMapper.getMaplist();
    }


}
