package com.huberthsieh.springbootmall.service.impl;

import com.huberthsieh.springbootmall.dao.UserDao;
import com.huberthsieh.springbootmall.dto.UserRegisterRequest;
import com.huberthsieh.springbootmall.model.User;
import com.huberthsieh.springbootmall.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDao userDao;

    @Override
    public User getUserById(Integer userId) {
        return userDao.getUserById(userId);
    }

    @Override
    public Integer register(UserRegisterRequest userRegisterRequest) {
        return userDao.createUser(userRegisterRequest);
    }
}