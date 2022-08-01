package com.nt.service;

import java.util.List;

import com.nt.model.Employee;

public interface IEmployeeServiceManagement {

	public List<Employee> getEmployeeService(int eno) throws Exception;
}
