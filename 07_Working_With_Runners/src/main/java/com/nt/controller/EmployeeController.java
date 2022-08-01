package com.nt.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.nt.model.Employee;
import com.nt.service.IEmployeeServiceManagement;

@Controller("controller")
public class EmployeeController {
	
	@Autowired
	private IEmployeeServiceManagement service;

	public EmployeeController() {
		System.out.println("EmployeeController:: controller class is executed");
	}

	public List<Employee> getEmployeeInController(int eno) throws Exception{
		
		List<Employee> list=service.getEmployeeService(eno);
		return list;
		
	}
}
