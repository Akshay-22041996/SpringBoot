package com.nt.runner;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.nt.model.Employee;
import com.nt.service.IEmployeeServiceManagement;

@Component
public class OperationActivitTest implements CommandLineRunner {
	
	@Autowired
	private IEmployeeServiceManagement service;

	@Override
	public void run(String... args) throws Exception {
		
		Employee emp=new Employee();
		emp.setEaddress("Jaipur");
		emp.setEname("Saumya");
		emp.setSal(17500.0);
		
		Employee emp1=new Employee();
		emp1.setEaddress("Jaipur");
		emp1.setEname("Nidhi");
		emp1.setSal(23500.0);
		
		Employee emp2=new Employee();
		emp2.setEaddress("Jaipur");
		emp2.setEname("Aaru");
		emp2.setSal(24600.0);
		
		/*	//Method 1 from IEmployeeServiceManagement interface registerEmployee(Employee emp	)
			String msg=service.registerEmployee(emp);
			System.out.println(msg);*/
		
		/*//Method 2 from IEmployeeServiceManagement interface registerGroupOfEmployee(Iterable<Employee> emp)
		String msg=service.registerGroupOfEmployee(List.of(emp, emp1, emp2));
		System.out.println(msg);*/
		
		/*//Method 3 from IEmployeeServiceManagement interface getTotalCountOfEmployee()
		long countOfEmp=service.getTotalCountOfEmployee();
		System.out.println("Total no of Employee found in DB is::"+countOfEmp);*/
		
		//Method 4 from IEmployeeServiceManagement interface getAllEmployeeRecord()
		Iterable<Employee> itEmp=service.getAllEmployeeRecord();
		List<Employee> listOfEmp=(List<Employee>) itEmp;
		/*//sorting all record by employee id
		//List<Employee> list1=	listOfEmp.stream().sorted((obj1,obj2)->obj1.getEid().compareTo(obj2.getEid())).collect(Collectors.toList());
	
		System.out.println("\nTotal no of record found is::"+list1.size()+"\n");
		list1.forEach(e->{
			System.out.println(e);
		});*/
		/*
		//adding 100000 in every eid whose eid is greater than 100
		List<Integer> list2=listOfEmp.stream().filter(obj1->obj1.getEid()>125).sorted((obj1,obj2)->obj1.getEid().compareTo(obj2.getEid())).map(empo->empo.getEid()+1000000).collect(Collectors.toList());
		System.out.println("\n\nThe number of record available is::"+list2.size()+"\n\n");
		list2.forEach(p->{
			System.out.println(p);
		});*/
	}

}
