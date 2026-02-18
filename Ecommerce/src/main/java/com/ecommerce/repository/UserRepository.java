package com.ecommerce.repository;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.ecommerce.entity.User;


@Repository
public class UserRepository {

	 @Autowired
	    private SessionFactory sessionFactory;

	    public void save(User user) {
	        sessionFactory.getCurrentSession().persist(user);
	    }

	    public User findByUsername(String username) {
	        return sessionFactory.getCurrentSession()
	                .createQuery("from User where userName = :name", User.class)
	                .setParameter("name", username)
	                .uniqueResult();
	    }
}
