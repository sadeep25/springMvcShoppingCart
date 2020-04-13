package com.shoppingcart.application.dao;

import java.util.List;

import com.shoppingcart.application.model.Order;
import com.shoppingcart.application.model.User;


public interface OrderDao {
	List<Order> findOrdersByUserName(String username);
	List<Order> list();
	void save(Order order);
}
