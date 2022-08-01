package com.nt.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.nt.model.Employee;
import com.nt.service.IEmployeeService;

@Controller("controller")
public class MainController {

	@Autowired
	private IEmployeeService service;
	
	public List<Employee> getAllEmployeeByDesg(String desg1,String desg2,String desg3){
		
		System.out.println("Controller class method is executed");
		List<Employee> list=service.getEmployee(desg1, desg2, desg3);
	
		return list;
	}
}
