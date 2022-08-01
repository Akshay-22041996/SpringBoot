package com.nt.service;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.domain.Sort.Direction;
import org.springframework.stereotype.Service;

import com.nt.model.Employee;
import com.nt.reposetory.IPagingAndSortingRepo;

@Service("employeeservice")
public class EmployeeServiceManagementImpl implements IEmployeeServiceManagement {
	
	@Autowired
	private IPagingAndSortingRepo repo;

	@Override
	public Iterable<Employee> fetchAllEmployeeByName(Boolean asc,String ... properties) {
		
		Sort  sort=Sort.by(asc?Direction.ASC:Direction.DESC, properties);
		
		Iterable<Employee> emp=repo.findAll(sort);
		return emp;
	}

	@Override
	public Page<Employee> performingPaging(int pageNo, int pagesize) {
	
		Pageable pageable=PageRequest.of(pageNo, pagesize);
		Page<Employee> page=repo.findAll(pageable);
		return page;
	}


}
