package com.huberthsieh.springbootmall.service;

import com.huberthsieh.springbootmall.dto.CreateOrderRequest;
import com.huberthsieh.springbootmall.dto.OrderQueryParams;
import com.huberthsieh.springbootmall.model.Order;

import java.util.List;

public interface OrderService {

    Integer countOrder(OrderQueryParams orderQueryParams);

    List<Order> getOrders(OrderQueryParams orderQueryParams);

    Order getOrderById(Integer orderId);

    Integer createOrder(Integer userId, CreateOrderRequest createOrderRequest);
}