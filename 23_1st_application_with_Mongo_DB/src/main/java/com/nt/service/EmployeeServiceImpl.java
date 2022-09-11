package com.nt.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nt.entity.Employee;
import com.nt.reposetory.IEmployeeRepo;

@Service("employeeService")
public class EmployeeServiceImpl implements IEmployeeServiceManagement {

	@Autowired
	private IEmployeeRepo repo;
	@Override
	public String registerEmployeeDetails(Employee emp) {
		repo.insert(emp);
		return "Employee is registered with id value is::"+emp.getId();
	}

}
