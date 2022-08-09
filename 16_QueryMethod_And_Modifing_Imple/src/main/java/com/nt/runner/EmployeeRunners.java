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
		
	//	int count=repo.deleteEmployee(0);
	//	System.out.println(count ==0?"Employee Not found with given no":"Employee is deleted with given id value is::");
		
		Employee emp=repo.getHighestPayingEmployee();
		System.out.println(emp);
		System.out.println("*******************************************************************************");
//		int count=repo.updateEmployeeDetails(126, "Kanpur");
//		System.out.println(count==0?"Employee not found":"Employee details is updated");
		System.out.println("*******************************************************************************");
//		int count =repo.updateCompleteEmployeeDetails(141, "Singapur", 110000);
//		System.out.println(count==0?"Employee Not found":"Employee details is updated");
		System.out.println("*******************************************************************************");
		int count4=repo.countTotalEmployees();
		System.out.println("Total no of EMployee in oraganization is::"+count4);
		System.out.println("*******************************************************************************");
		
		
	
	}

}
