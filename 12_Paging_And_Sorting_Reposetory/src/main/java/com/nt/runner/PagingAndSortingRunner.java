package com.nt.runner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Component;

import com.nt.model.Employee;
import com.nt.service.IEmployeeServiceManagement;

@Component
public class PagingAndSortingRunner implements CommandLineRunner {
	
	@Autowired
	private IEmployeeServiceManagement service;

	@Override
	public void run(String... args) throws Exception {
		
	//	Iterable<Employee> emp=service.fetchAllEmployeeByName(false, "ename");
	//	emp.forEach(System.out::println);
		
		Page<Employee> paging=service.performingPaging(0, 6);
		System.out.println("NumberOfElement::"+ paging.getNumberOfElements());
		System.out.println("PageSize::"+ paging.getSize());
		System.out.println("Total no of Element::"+ paging.getTotalElements());
		System.out.println(" GetTotal pages::"+ paging.getTotalPages());
		System.out.println("Pagecontent type::"+ paging.getContent());
		paging.forEach(System.out::println);
		
	
	}
	
	
	
	

}
