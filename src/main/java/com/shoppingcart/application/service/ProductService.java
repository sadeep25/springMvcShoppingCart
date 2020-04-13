package com.shoppingcart.application.service;

import com.shoppingcart.application.model.Product;

import java.util.List;

public interface ProductService {
    void save(Product product);
    List<Product> list();
}
