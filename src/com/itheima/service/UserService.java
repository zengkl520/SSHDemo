package com.itheima.service;

import com.itheima.domain.User;

public interface UserService {

	User getUserByCodePassword(User u);
	
	void saveUser(User u);
}
