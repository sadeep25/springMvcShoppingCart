package com.shoppingcart.application.dao;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;

import com.shoppingcart.application.model.Product;
import org.springframework.stereotype.Repository;

@Repository
public class ProductDaoImpl implements ProductDao {
	@Autowired
    private SessionFactory sessionFactory;
	@Override
	public List<Product> list() {
		@SuppressWarnings("unchecked")
		List<Product> products=sessionFactory.getCurrentSession()
                .createQuery("from Product")
                .list();

                if (products.size() > 0) {
                    return products;
                } else {
                    return null;
                }
	}

	@Override
	public void save(Product product) {
		sessionFactory.getCurrentSession().save(product);	
	}

}
