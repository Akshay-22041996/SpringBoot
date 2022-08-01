package com.nt.runner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Sort.Direction;
import org.springframework.stereotype.Component;

import com.nt.model.Employee;
import com.nt.service.IEmployeeServiceMangement;

@Component
public class PagingAndSortingRunner implements CommandLineRunner {
	@Autowired
	 private IEmployeeServiceMangement service;

	@Override
	public void run(String... args) throws Exception {
		
	//	Iterable<Employee> list1=service.getAllEmployeeBySorting(true, "eid");
	//	list1.forEach(System.out::println);
		
		Page<Employee> page1=service.getByPage(1, 6);
		page1.forEach(System.out::println);
		
	//	Page<Employee> page3=service.getByDirection(2, 6, true, "eid");
	//	page3.forEach(System.out::println);
		
		Page<Employee> page4=service.getByOlyDirection(0, 10, Direction.ASC, "eid");
		System.out.println(page4.getNumberOfElements());
		System.out.println(page4.getTotalElements());
		System.out.println(page4.getTotalPages());
		page4.forEach(System.out::println);
	}

}
