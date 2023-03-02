package com.bIT.dao;

import java.io.Serializable;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.bIT.entity.Employee;

@Repository
public class EmpDaoImpl implements EmpDaoI{

	@Autowired
	private SessionFactory sessionFactory;
	
	
	@Override
	public int saveEmpToDB(Employee employee) {
		System.out.println("Dao Layer Called");
		System.out.println(employee);
		
		Session session = sessionFactory.openSession();
		session.beginTransaction();
		
		int id = (int)session.save(employee);
		
		return id;
	}


	@Override
	public List<Employee> getEmpfromDB() {
		
		Session session = sessionFactory.openSession();
		Query query = session.createQuery("from Employee");
		List<Employee> list = query.getResultList();
		
		return list;
	}


	@Override
	public List<Employee> getAll() {
		Session session = sessionFactory.openSession();
		Query query = session.createQuery("from Employee");
		List<Employee> list = query.getResultList();
		
		return list;
	}

}
