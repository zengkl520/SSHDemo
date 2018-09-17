package com.itheima.service.impl;

import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.itheima.dao.UserDao;
import com.itheima.domain.User;
import com.itheima.service.UserService;
@Transactional(isolation=Isolation.REPEATABLE_READ,propagation=Propagation.REQUIRED,readOnly=true)
public class UserServiceImpl implements UserService{

	
	private UserDao ud;
	
	@Override
	public User getUserByCodePassword(User u) {
		// TODO Auto-generated method stub
		
		System.out.println("getUserByCodePassword");
		return null;
	}

	@Override
	@Transactional(isolation=Isolation.REPEATABLE_READ,propagation=Propagation.REQUIRED,readOnly=false)
	public void saveUser(User u) {
		// TODO Auto-generated method stub
		ud.save(u);
	}

	public void setUd(UserDao ud) {
		this.ud = ud;
	}
	
	

}
