package com.huberthsieh.springbootmall.service;

import com.huberthsieh.springbootmall.dto.ProductRequest;
import com.huberthsieh.springbootmall.model.Product;

public interface ProductService {

    Product getProductById(Integer productId);

    Integer createProduct(ProductRequest productRequest);

    void updateProduct(Integer productId, ProductRequest productRequest);

    void deleteProductById(Integer productId);
}
