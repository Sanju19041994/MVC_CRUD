package com.bIT.service;

import java.util.List;

import com.bIT.entity.Employee;

public interface EmpServiceI {

	public int saveEmp(Employee employee);
	
	public boolean loginCheck(Employee employee);
	
	public List<Employee> getAllData();
	
	
}
