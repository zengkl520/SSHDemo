package com.itheima.dao;

import com.itheima.domain.User;

public interface UserDao {

	//根据用户名查询user对象
	User getByUserCode(String usercode);

	void save(User u);
}
