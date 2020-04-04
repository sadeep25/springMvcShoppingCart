package com.shoppingcart.application.dao;

import com.shoppingcart.application.model.User;

public interface UserDao {

    User findByUserName(String username);
    void save(User user);
}