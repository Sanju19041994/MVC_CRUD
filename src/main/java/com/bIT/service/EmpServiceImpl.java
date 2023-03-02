package com.bIT.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bIT.dao.EmpDaoImpl;
import com.bIT.entity.Employee;

@Service
public class EmpServiceImpl implements EmpServiceI{


	@Autowired
	private EmpDaoImpl empDaoImpl;
	
	@Override
	public int saveEmp(Employee employee) {
		System.out.println("Service Layer Called");
		System.out.println(employee);
		
		int id = empDaoImpl.saveEmpToDB(employee);
		
		return id;
	}

	@Override
	public boolean loginCheck(Employee employee) {
		
		List<Employee> empfromDB = empDaoImpl.getEmpfromDB();
		for(Employee emp : empfromDB)
		{
			if(employee.getEusername().equals(emp.getEusername()) && 
					employee.getEuserpass().equals(emp.getEuserpass()))	
			{
				return true;
			}
		}
		
		return false;
	}

	@Override
	public List<Employee> getAllData() {
		
		List<Employee> list = empDaoImpl.getAll();
		
		return list;
	}



}
