package com.huberthsieh.springbootmall.service;

import com.huberthsieh.springbootmall.constant.ProductCategory;
import com.huberthsieh.springbootmall.dto.ProductRequest;
import com.huberthsieh.springbootmall.model.Product;

import java.util.List;

public interface ProductService {
    List<Product> getProducts(ProductCategory category, String search);

    Product getProductById(Integer productId);

    Integer createProduct(ProductRequest productRequest);

    void updateProduct(Integer productId, ProductRequest productRequest);

    void deleteProductById(Integer productId);
}
