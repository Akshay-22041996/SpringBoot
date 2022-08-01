package com.nt.service;

import org.springframework.data.domain.Page;

import com.nt.model.Employee;

public interface IEmployeeServiceManagement {

	public Iterable<Employee> fetchAllEmployeeByName(Boolean asc,String ... properties);
	
	public Page<Employee> performingPaging(int pageNo,int pagesize);
}
