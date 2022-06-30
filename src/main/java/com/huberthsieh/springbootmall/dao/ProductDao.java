package com.huberthsieh.springbootmall.dao;

import com.huberthsieh.springbootmall.constant.ProductCategory;
import com.huberthsieh.springbootmall.dto.ProductRequest;
import com.huberthsieh.springbootmall.model.Product;

import java.util.List;

public interface ProductDao {
    List<Product> getProducts(ProductCategory category, String search);

    Product getProductById(Integer productId);

    Integer createProduct(ProductRequest productRequest);

    void updateProduct(Integer productId, ProductRequest productRequest);

    void deleteProductById(Integer productId);
}
