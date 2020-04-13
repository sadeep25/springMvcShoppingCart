package com.shoppingcart.application.dao;

import java.util.List;

import com.shoppingcart.application.model.Product;

public interface ProductDao {
	List<Product> list();
	void save(Product product);
}
