package com.shoppingcart.application.service;

import com.shoppingcart.application.model.User;
import org.springframework.security.core.userdetails.UserDetailsService;

public interface UserService{
    void save(User user);
}
