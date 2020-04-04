package com.shoppingcart.application.service;

import com.shoppingcart.application.dao.UserDao;
import com.shoppingcart.application.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserDao userDao;
    @Transactional
    @Override
    public void save(User user) {
        userDao.save(user);
    }
}
