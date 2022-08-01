package com.nt.runner;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.nt.controller.EmployeeController;
import com.nt.model.Employee;

@Component("runner")
public class RunnerTest implements CommandLineRunner {
	
	@Autowired
	private EmployeeController controller;
	
	

	public RunnerTest() {
		System.out.println("RunnerTest::Runner class is executed");
	}



	@Override
	public void run(String... args) throws Exception {
	
		List<Employee> list=controller.getEmployeeInController(1);
		
		list.forEach(emp->{
			System.out.println("in for each loop");
			System.out.println(emp);
		});
	}

}
