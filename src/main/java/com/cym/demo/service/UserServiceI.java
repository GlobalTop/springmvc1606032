package com.cym.demo.service;

import java.util.List;
import java.util.Map;

import com.cym.demo.model.User;
import com.cym.demo.model.User1;

public interface UserServiceI {

    public User getUserById(Integer id);

    public int addUser(User record);

    public int delUserById(Integer id);

    public int updateUser(User record);

    public List<User> selectUser(Integer userId);

    public List<Map<String, Object>> getMaplist();

    public User1 getUserById1(Integer id);


}
