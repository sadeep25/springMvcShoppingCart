package com.shoppingcart.application.dto;

import com.shoppingcart.application.model.OrderItem;
import com.shoppingcart.application.model.User;

import java.util.*;

public class OrderDto {
    private int id;
    private double total;
    private List<OrderItem> orderItems=new ArrayList<OrderItem>();

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    public List<OrderItem> getOrderItems() {
        return orderItems;
    }

    public void setOrderItems(List<OrderItem> orderItems) {
        this.orderItems = orderItems;
    }



}
