package com.nt.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.nt.dao.IEmployeeDAO;
import com.nt.model.Employee;


@Service("service")
public class EmployeeServiceImpl implements IEmployeeService {
	
	@Autowired
	
	private IEmployeeDAO repo;

	@Override
	public List<Employee> getEmployee(String desg1, String desg2, String desg3) {
		
		System.out.println("Service class method is executed");
		List<Employee> list=repo.getEmployee(desg1, desg2, desg3);
		
		return list;
	}

}
