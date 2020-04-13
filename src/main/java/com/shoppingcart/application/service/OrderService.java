package com.shoppingcart.application.service;

import com.shoppingcart.application.model.Order;

import java.util.List;

public interface OrderService {
    void save(Order order);
    List<Order> list();
}
