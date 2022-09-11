package com.nt.runner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.nt.entity.Employee;
import com.nt.service.IEmployeeServiceManagement;

@Component
public class EmployeeRunner implements CommandLineRunner {

	@Autowired
	private IEmployeeServiceManagement service;
	@Override
	public void run(String... args) throws Exception {
		Employee emp=new Employee();
		emp.setEaddress("Nagpur");emp.setEname("Raka");emp.setSalary(6000.0);emp.setEno(106);
		String msg=service.registerEmployeeDetails(emp);
		System.out.println(msg);

	}

}
