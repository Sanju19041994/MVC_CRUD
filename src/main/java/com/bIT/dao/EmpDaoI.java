package com.bIT.dao;

import java.util.List;

import com.bIT.entity.Employee;

public interface EmpDaoI {

	public int saveEmpToDB(Employee employee);
	
	public List<Employee> getEmpfromDB();
	
	public List<Employee> getAll();
	
}
