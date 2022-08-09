package com.nt.runner;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.nt.model.Employee;
import com.nt.reposetory.EmployeeRepo;

@Component
public class EmployeeRunners implements CommandLineRunner {
	
	@Autowired
	private EmployeeRepo repo;

	@Override
	public void run(String... args) throws Exception {
		
		List<Employee> list=repo.fetchEmployeesByName("janvi");
		//list.forEach(System.out::println);
		System.out.println("*********************************************");
		List<Employee> list1=repo.fetchEmployeesByLetters("R");
	//	list1.forEach(System.out::println);
		System.out.println("*********************************************");
		List<Employee> list2=repo.fetchEmployeesContaining('g');
	//	list2.forEach(System.out::println);
		
	/*List<Object> empByAddress=repo.fetchEmployeeByAddress("Vizag");
	empByAddress.forEach(emp->{
		for(Object obj:(Object[]) emp) {
			System.out.print(obj+" ");
			
		}
		System.out.println();
	});*/
		
	/*repo.fetchEmployeeBetweenSal(25000.0, 40000.0).forEach(emp->{
		for(Object obj:emp) {
			System.out.print(obj+"  ");
		}
		System.out.println();
	});*/
	
	Employee emp=repo.fetchEmployeeById(6);
	//System.out.println(emp);
	
	List<String> lname=repo.getEname("Mumbai");
	lname.forEach(name->{
		System.out.println(name);
	});
	
	}

}
