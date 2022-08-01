package com.nt.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nt.dao.IEmployeeDAO;
import com.nt.model.Employee;

@Service("empSer")
public class EmployeeServiceImpl implements IEmployeeService {
	
	@Autowired
	private IEmployeeDAO dao;

	@Override
	public List<Employee> fetchAllEmployee(String desg1, String desg2, String desg3) throws Exception {
		
		List<Employee> list=dao.getEmployee(desg1, desg2, desg3);
		System.out.println("In service class");
		return list;
	}

}
