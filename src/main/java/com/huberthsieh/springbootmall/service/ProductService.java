package com.huberthsieh.springbootmall.service;

import com.huberthsieh.springbootmall.model.Product;

public interface ProductService {

    Product getProductById(Integer productId);
}