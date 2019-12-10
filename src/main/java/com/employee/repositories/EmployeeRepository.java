package com.employee.repositories;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.employee.entities.EmployeeEntity;

public class EmployeeRepository {

	private SessionFactory sessionFactory;

	public void save(EmployeeEntity employee) {
		Session session = sessionFactory.openSession();
		session.beginTransaction();

		session.save(employee);
		session.getTransaction().commit();
		session.close();

	}

	public SessionFactory getSessionFactory() {
		return sessionFactory;
	}

	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

}
