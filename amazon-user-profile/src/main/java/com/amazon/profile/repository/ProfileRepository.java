package com.amazon.profile.repository;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.amazon.profile.entity.ProfileEntity;

@Repository
public class ProfileRepository {

	@Autowired
	SessionFactory sessionFactory;

	public Integer saveProfile(ProfileEntity entity) {
		System.out.println("ProfileRepository.saveProfile():::::::::::: START");
		Session session = sessionFactory.openSession();
		Transaction txn = session.beginTransaction();
		Integer response = (Integer) session.save(entity); // insert or update the record in profile table

		txn.commit();
		System.out.println("ProfileRepository.saveProfile()::::::::::::::::::::: END");
		return response;

	}

	public ProfileEntity getProfileByEmail(String _email) {

		System.out.println("ProfileRepository.getProfileByEmail():::::::::::: START");
		Session session = sessionFactory.openSession();

		ProfileEntity response = session.createQuery("from ProfileEntity where email=:email", ProfileEntity.class)
				.setParameter("email", _email).uniqueResult();

		System.out.println("ProfileRepository.getProfileByEmail()::::::::::::::::::::: END");

		return response;

	}
}
