package com.amazon.users.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.amazon.users.UserEntity;
import com.amazon.users.controller.UserController;
import com.amazon.users.repository.UserRepository;
import com.amazon.users.request.User;

@Service
public class UserService {

	
	@Autowired
	UserRepository repository;

	public int createUser(User user) {

		System.out.println("UserService.createUser()");

		UserEntity entity = new UserEntity();

		entity.setFirstName(user.getFirstName());
		entity.setLastName(user.getLastName());
		entity.setAddress(user.getAddress());

		entity = repository.save(entity);
		getUsers();
		UserEntity userEntity = repository.getUserByFirstName("kudrat");
		System.out.println(" result from derived : "+userEntity.getFirstName());
		return entity.getUserId();
	}

	public void getUsers() {
		
		Pageable pageable = PageRequest.of(0, 10);
		Page<UserEntity> page = repository.findAll(pageable);
		System.out.println("UserService.getUsers()");
		
		for (UserEntity userEntity : page) {
			System.out.println(userEntity.getUserId());
		}

	}

}
