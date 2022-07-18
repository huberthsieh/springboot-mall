package com.huberthsieh.springbootmall.dao;

import com.huberthsieh.springbootmall.dto.UserRegisterRequest;
import com.huberthsieh.springbootmall.model.User;

public interface UserDao {

    User getUserById(Integer userId);

    Integer createUser(UserRegisterRequest userRegisterRequest);
}