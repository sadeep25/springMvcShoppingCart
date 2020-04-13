package com.shoppingcart.application.service;

import com.shoppingcart.application.dao.ProductDao;
import com.shoppingcart.application.model.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
@Service
public class ProductServiceImpl implements ProductService{

    @Autowired
    private ProductDao productDao;

    @Override
    @Transactional
    public void save(Product product) {
        productDao.save(product);
    }

    @Override
    @Transactional
    public List<Product> list() {
        return productDao.list();
    }
}
