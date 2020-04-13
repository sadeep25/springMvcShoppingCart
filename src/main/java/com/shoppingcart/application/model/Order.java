package com.shoppingcart.application.model;


import org.hibernate.annotations.CreationTimestamp;

import java.util.*;

import javax.persistence.*;

@Entity
@Table(name = "orders", catalog = "shoppingCartDb")
public class Order {

    private int id;
    private double total;
    private Date orderDate;
    private User user;
    private List<OrderItem> orderItems = new ArrayList<OrderItem>();

    public Order() {
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", unique = true, nullable = false)
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Column(name = "total")
    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    @CreationTimestamp
    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "order_date")
    public Date getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(Date orderDate) {
        this.orderDate = orderDate;
    }

    @ManyToOne(fetch= FetchType.EAGER)
    @JoinColumn(name = "username", nullable = false)
    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "order",fetch= FetchType.EAGER)
    public List<OrderItem> getOrderItems() {
        return orderItems;
    }

    public void setOrderItems(List<OrderItem> orderItems) {
        this.orderItems = orderItems;
    }


}
