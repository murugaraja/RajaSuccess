package com.vaannila.service;

import org.springframework.stereotype.Service;

import com.vaannila.domain.User;

@Service("userService1")
public class UserServiceImpl implements UserService {

	@Override
	public void add(User user) {
		//Persist the user object here. 
		System.out.println("User added successfully");

	}

}
