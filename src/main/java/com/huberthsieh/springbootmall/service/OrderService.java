package com.huberthsieh.springbootmall.service;

import com.huberthsieh.springbootmall.dto.CreateOrderRequest;
import com.huberthsieh.springbootmall.model.Order;

public interface OrderService {

    Order getOrderById(Integer orderId);

    Integer createOrder(Integer userId, CreateOrderRequest createOrderRequest);
}