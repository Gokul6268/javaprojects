package com.ecommerce.repository;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.ecommerce.entity.Product;
@Repository
public class ProductRepository {

	@Autowired
    private SessionFactory sessionFactory;

    public Product save(Product product) {
        Session session = sessionFactory.getCurrentSession();
        session.persist(product);
        return product;
    }

    public Product findByName(String name) {
        return sessionFactory.getCurrentSession()
                .createQuery("from Product where name = :name", Product.class)
                .setParameter("name", name)
                .uniqueResult();
    }
}
