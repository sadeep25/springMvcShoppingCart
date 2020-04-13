package com.shoppingcart.application.service;

import com.shoppingcart.application.dao.OrderDao;
import com.shoppingcart.application.model.Order;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
@Service
public class OrderServiceImpl implements OrderService {

    @Autowired
    OrderDao orderDao;

    @Override
    @Transactional
    public void save(Order order) {
        orderDao.save(order);
    }

    @Override
    @Transactional
    public List<Order> list() {
        return orderDao.list();
    }
}
