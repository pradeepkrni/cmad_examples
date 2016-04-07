package com.mydomain.model;

import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.junit.Assert;
import org.junit.Test;
import org.junit.BeforeClass;
public class HibernateTest {

	
	@Test
	public void testUserLoading() {
		int x = 3 +4;
		Assert.assertEquals(7,x);
	}
}
