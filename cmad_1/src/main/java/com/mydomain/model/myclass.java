package com.mydomain.model;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;

public class myclass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Configuration configuration = new Configuration().configure("hibernate.cfg.xml");
		ServiceRegistry serviceRegistry = new StandardServiceRegistryBuilder()
				.applySettings(configuration.getProperties()).build();
		SessionFactory sessionFactory = configuration.buildSessionFactory(serviceRegistry);
		
		Session session = sessionFactory.openSession();
		
		List<Users> userList = session.createQuery("select u from Users u").list();
		
		
		System.out.println(userList);

		Users newuser =  new Users();
		newuser.setName("Pradeep Kumar");
		newuser.setAge(35);
		session.save(newuser);
		Transaction tx = session.beginTransaction();
		tx.commit();
        
		List<Users> userList1 = session.createQuery("select u from Users u").list();
		
		
		System.out.println(userList1);
		session.close();
	}

}
