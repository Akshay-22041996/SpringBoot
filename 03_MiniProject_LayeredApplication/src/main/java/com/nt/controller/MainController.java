package com.nt.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.nt.model.Employee;
import com.nt.service.IEmployeeService;

@Controller("mainController")
public class MainController {

	@Autowired
	private IEmployeeService ser;

	public List<Employee> showAllEmp(String desg1,String desg2,String desg3) throws Exception{
		
		List<Employee> list=ser.fetchAllEmployee(desg1, desg2, desg3);
		System.out.println("In controller class");
		return list;
	}
}
