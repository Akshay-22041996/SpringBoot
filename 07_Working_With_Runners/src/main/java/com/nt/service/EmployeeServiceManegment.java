package com.nt.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nt.dao.IEmployeeDAO;
import com.nt.model.Employee;

@Service("service")
public class EmployeeServiceManegment implements IEmployeeServiceManagement {
	
	@Autowired
	private IEmployeeDAO dao;

	public EmployeeServiceManegment() {
		System.out.println("EmployeeServiceManegment::service class is executed");
	}

	@Override
	public List<Employee> getEmployeeService(int eno) throws Exception {
		List<Employee> list=dao.getEmployeeDao(eno);
		return list;
	}

}
