/*
* (C) Copyright Thanh Trung Do 
* @author Admin
* @date Sep 11, 2020
*/
package trung.hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;

import trung.hibernate.model.Course;

public class Management {

	public static void main(String[] args) {
		Course course = new Course(1, "Java");
		SessionFactory sessionFactory = ConnectionUtil.getSessionFactory();
		Session session = sessionFactory.openSession();
		session.beginTransaction();
		session.save(course);
		session.getTransaction().commit();
		sessionFactory.close();

	}

}
