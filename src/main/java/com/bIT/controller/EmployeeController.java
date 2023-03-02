package com.bIT.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.bIT.entity.Employee;
import com.bIT.service.EmpServiceImpl;

@Controller
public class EmployeeController {

	@Autowired
	private EmpServiceImpl empServiceImpl;
	
	@GetMapping("/openform")
	public String openForm() {
		
		return "openingform";
	}
	
	@PostMapping("/reg")
	public String registrationSuccess(Employee employee, Model model)
	{
		System.out.println("Controller Layer Called");
		System.out.println(employee);
		
		int id = empServiceImpl.saveEmp(employee);
		model.addAttribute("ID", id);
		
		return "regSuccess";
	}
	
	@GetMapping("/loginform")
	public String loginForm() {
		
		return "login";
	}
	
	@PostMapping("/loginreturn")
	public String loginStatus(Employee employee) {
		
		boolean check = empServiceImpl.loginCheck(employee);
		
		if(check) {
			return "loginSeccess";
		}
		else
		return "loginFail";
	}
	
	@GetMapping("/getAllempData")
	public String getAllEmpData(Model model) {
		List<Employee> allData = empServiceImpl.getAllData();
		model.addAttribute("DataToShow", allData);
		return "getalldata";
	}
	
	@GetMapping(value = "allInOne")
	public String allActivity() {
		return "allActivity";
	}
}
