package com.itheima.web.action;

import com.itheima.service.UserService;
import com.opensymphony.xwork2.ActionSupport;

public class UserAction extends ActionSupport{

	private UserService userService;


	public void setUserService(UserService userService) {
		this.userService = userService;
	}


	public String login() throws Exception {
		// TODO Auto-generated method stub
		System.out.println(userService);
		return super.execute();
	}
	
	
	
}
