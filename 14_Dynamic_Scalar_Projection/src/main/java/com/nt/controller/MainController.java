package com.nt.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.nt.proxy.SecondImpl;
import com.nt.service.EmployeeManagementImpl;

@Controller("employeecontroller")
public class MainController {

	@Autowired
	private EmployeeManagementImpl service;
	
	public List<SecondImpl> getAllEmployeeByLetters(String c,Class<SecondImpl> clazz){
		List<SecondImpl> listcontroller=service.getEmployeeHavingLetter(c,clazz);
		return listcontroller;
	}
}
