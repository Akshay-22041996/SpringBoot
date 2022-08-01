package com.nt.service;

import java.util.List;
import java.util.Optional;

import com.nt.model.Employee;

public interface IEmployeeServiceManagement {

	public String registerEmployee(Employee emp);
	public String registerGroupOfEmployee(Iterable<Employee> emp);
	public String totalNoOfEmployee();
	public String employeeAvailableOrNot(Integer id	);
	public String searchEmployeeById(Integer id);
	public Iterable<Employee> searchMultipleEmployee();
	public String fetchMultipleEmployeeById(List<Integer> ids);
	public Optional<Employee> fetchEmployeeById(int id);
	public String performPartialUpdate(int id,Double sal);
	public String performFullUpdate(Employee emp);
}
