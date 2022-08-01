package com.nt.runner;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.nt.model.Employee;
import com.nt.service.IEmployeeServiceManagement;

@Component
public class EmployeeExceutionRunner implements CommandLineRunner {
	
	@Autowired
	private IEmployeeServiceManagement service;
	

	@Override
	public void run(String... args) throws Exception {
		Employee emp1=new Employee();
		emp1.setEname("Sahil");
		emp1.setEaddress("Nagpur");
		emp1.setSal(26500.0);
		/*
		String registerEmployeeMsg=service.registerEmployee(emp1);
		System.out.println(registerEmployeeMsg);*/
		
		Employee emp2=new Employee();
		emp2.setEaddress("NewYork");
		emp2.setEname("Amit");
		emp2.setSal(38000.0);
		
		Employee emp3=new Employee();
		emp3.setEaddress("Sidney");
		emp3.setEname("Sahil");
		emp3.setSal(2500.0);
		/*	
			String msg=service.registerGroupOfEmployee(List.of(emp1, emp2,emp3));
			System.out.println(msg);*/
		
		/*String countMsg=service.totalNoOfEmployee();
		System.out.println(countMsg);*/
		
		/*String avaOrNotMsg=service.employeeAvailableOrNot(400);
		System.out.println(avaOrNotMsg);*/
		
		/*	String findMsg=service.searchEmployeeById(41);
			System.out.println(findMsg);*/
		
		Iterable<Employee> getMultipleEmployee=service.searchMultipleEmployee();
		
		/*	//By using advanced for Loop
			for(Employee emp:getMultipleEmployee) {
				System.out.println(emp);
			}*/
		
		/*	//by using lamda and forEach()
			getMultipleEmployee.forEach(emp->{
				System.out.println(emp);
			});*/
		List<Employee> listOfEmp=(List<Employee>) getMultipleEmployee;
		
		List<Integer> listOfId=listOfEmp.stream().map(empo->empo.getEid()).collect(Collectors.toList());
		System.out.println(listOfId+"  and count is----->"+listOfId.size());
		//Collecting all unique and duplicate names from DB tables
		List<String> listOfName=listOfEmp.stream().map(empo->empo.getEname()).collect(Collectors.toList());
		System.out.println(listOfName+"  and count is----->"+listOfName.size());
		//Collecting only unique names from DB tables
		Set<String> setOfName=listOfEmp.stream().map(empo->empo.getEname()).collect(Collectors.toSet());
		System.out.println(setOfName+"  count is----->  "+setOfName.size());
		
		
		//Collecting only name from DB table in natural sorting order
			List<String> listOfNaturalName=listOfEmp.stream().sorted((empName1,empName2)->empName1.getEname().compareToIgnoreCase(empName2.getEname())).map(empo->empo.getEname()).collect(Collectors.toList());
			System.out.println(listOfNaturalName+" ------>"+listOfNaturalName.size());
		//System.out.println("***************************");
		listOfEmp.stream().filter((x)->x.getEntryTime()==null).sorted((per1,per2)->per1.getEid().compareTo(per2.getEid())).forEach(System.out::println);
	
		//Iterable<Employee> list2=service.searchMultipleEmployee();
		//List<Employee> listCasting=(List<Employee>) list2;
		
		/*
			//Retriving multiple employee at a time
			String msg= service.fetchMultipleEmployeeById(Arrays.asList(5,0,1000));
			System.out.println(msg);
			*/
		
		/*	Optional<Employee> employee1=service.fetchEmployeeById(5);
			Employee empo1=employee1.orElseThrow(()->new IllegalArgumentException("Employee number not available"));
			System.out.println(empo1);*/
		
		/*System.out.println("Performing partial update operation");
		String updateMsg=service.performPartialUpdate(9000, 5232525.0);
		System.out.println(updateMsg);*/
		
		/*	System.out.println("Performing Full object operation");
			Employee updateEmployee=new Employee();
			updateEmployee.setEaddress("Jabalpur");
			updateEmployee.setEid(64);
			updateEmployee.setSal(987654321.0);
			updateEmployee.setEname("Varsh");
			
			String fullUpdateMsg=service.performFullUpdate(updateEmployee);
			System.out.println(fullUpdateMsg);*/
		
	}

}
