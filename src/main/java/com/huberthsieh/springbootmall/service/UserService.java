package com.huberthsieh.springbootmall.service;

import com.huberthsieh.springbootmall.dto.UserRegisterRequest;
import com.huberthsieh.springbootmall.model.User;

public interface UserService {

    User getUserById(Integer userId);

    Integer register(UserRegisterRequest userRegisterRequest);
}