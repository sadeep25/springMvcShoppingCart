package com.shoppingcart.application.dao;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import com.shoppingcart.application.model.Order;

@Repository
public class OrderDaoImpl implements OrderDao {

    @Autowired
    private SessionFactory sessionFactory;

    @Override
    public void save(Order order) {
        sessionFactory.getCurrentSession().save(order);
    }

    @SuppressWarnings("unchecked")
    @Override
    public List<Order> findOrdersByUserName(String username) {

        List<Order> orders = new ArrayList<Order>();

        orders = sessionFactory.getCurrentSession()
                .createQuery("from Order where user.username=?")
                .setParameter(0, username)
                .list();

        if (orders.size() > 0) {
            return orders;
        } else {
            return null;
        }
    }

    @SuppressWarnings("unchecked")
    @Override
    public List<Order> list() {

        List<Order> orders = new ArrayList<Order>();

        orders = sessionFactory.getCurrentSession()
                .createQuery("from Order")
                .list();

        if (orders.size() > 0) {
            return orders;
        } else {
            return null;
        }
    }
}
