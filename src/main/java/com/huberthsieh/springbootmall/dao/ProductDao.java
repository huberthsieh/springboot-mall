package com.huberthsieh.springbootmall.dao;

import com.huberthsieh.springbootmall.model.Product;

public interface ProductDao {

    Product getProductById(Integer productId);
}
