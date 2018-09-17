package com.itheima.test;

import java.util.List;
import java.util.Map;
import java.util.Set;

import javax.annotation.Resource;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.itheima.dao.UserDao;
import com.itheima.domain.User;
import com.itheima.service.UserService;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:applicationContext.xml")
public class HibernateTest {

	@Resource(name="sessionFactory")
	private SessionFactory sf;
	@Test
	public void fun1(){
		
		Configuration conf  = new Configuration().configure(); 
		
		SessionFactory sf = conf.buildSessionFactory();
		
		Session session =  sf.openSession();
		
		Transaction tx = session.beginTransaction();
		
		User u =  new User();
		u.setUser_code("jack");
		u.setUser_name("½Ü¿Ë");
		u.setUser_password("0000");
		
		session.save(u);
		
		
		tx.commit();
		
		session.close();
	    sf.close();
	}
	
	@Test
	public void fun2(){
		
		Session session =  sf.openSession();
		
		Transaction tx = session.beginTransaction();
		
		User u =  new User();
		u.setUser_code("rose");
		u.setUser_name("Ãµ¹å");
		u.setUser_password("6666");
		
		session.save(u);
		
		
		tx.commit();
		
		session.close();
	}
	
	@Resource(name="userDao")
	private UserDao ud;
	
	@Test
	public void fun3(){
		
		User u = ud.getByUserCode("jerry");
		System.out.println(u);
		
	}
	
	@Resource(name="userService")
	private UserService us;
	
	@Test
	public void fun4(){
		
		User u =  new User();
		u.setUser_code("xiaofen");
		u.setUser_name("Ð¤·Ò");
		u.setUser_password("2333");
		
		us.saveUser(u);
		
	}
	
	
}
