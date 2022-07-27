package com.huberthsieh.springbootmall.service;

import com.huberthsieh.springbootmall.dto.CreateOrderRequest;

public interface OrderService {

    Integer createOrder(Integer userId, CreateOrderRequest createOrderRequest);
}