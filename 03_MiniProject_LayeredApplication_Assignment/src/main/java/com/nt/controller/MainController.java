package com.nt.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.nt.model.StudentInfo;
import com.nt.service.IStudentManagementService;

@Controller("controller")
public class MainController {

	@Autowired
	private IStudentManagementService service;
	
	public List<StudentInfo> showAllStudent(String sub1,String sub2,String sub3) throws Exception{
		
		System.out.println("Controller Class :: show method is executed");
		List<StudentInfo> list=service.fetchallStudent(sub1, sub2, sub3);
		return list;
	}
}
