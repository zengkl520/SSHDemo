package com.itheima.dao;

import com.itheima.domain.User;

public interface UserDao {

	//�����û�����ѯuser����
	User getByUserCode(String usercode);

	void save(User u);
}
