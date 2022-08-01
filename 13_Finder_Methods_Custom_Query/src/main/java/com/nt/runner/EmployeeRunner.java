package com.nt.runner;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.nt.controller.EmployeeControllerClass;
import com.nt.model.Employee;
import com.nt.model.IScalar;

@Component
public class EmployeeRunner implements CommandLineRunner {
	
	@Autowired
	private EmployeeControllerClass controller;

	@Override
	public void run(String... args) throws Exception {
		Iterable<Employee> getLikeWiseEmployee=controller.getLikeEmployee("Raj");
		getLikeWiseEmployee.forEach(System.out::println);
		System.out.println("****************************************");
		Iterable<Employee> getByGreaterThanSal=controller.getEmployeesByMaxSal(100000.0);
		getByGreaterThanSal.forEach(System.out::println);
		System.out.println("****************************************");
		
		System.out.println("Names Containing letter a::\n");
		Iterable<Employee> getEmployeeByWord=controller.getEmployeeByLetters('a');
		getEmployeeByWord.forEach(System.out::println);
		System.out.println("****************************************");
		
		System.out.println("Getting sal of Employee in between::\n\n");
		Iterable<Employee> list=controller.getEmployeeWhosSalBetween(20000.0, 30000.0);
		list.forEach(System.out::println);
		System.out.println("****************************************");
		
		System.out.println("Getting List of Employee Who's name start with::");
		Iterable<Employee> listOfEmployeeStartWith=controller.getEmployeeWhosNameStartWith('R');
		List<Employee> listcount=(List<Employee>) listOfEmployeeStartWith;
		System.out.println("Total no of detected is::"+listcount.size()+"\n\n");
		listOfEmployeeStartWith.forEach(System.out::println);
		System.out.println("****************************************");
		System.out.println("Getting EMployees by address with intinal letter::\n\n");
		List<Employee> empslist=controller.getEmployeeByInitialAddressByLetter('r');
		System.out.println("Total record fetch is::"+empslist.size());
		for(Employee emps:empslist) {
			System.out.print(emps.getEid()+"  "+emps.getEname()+"  "+emps.getEaddress()+"  "+emps.getSal()+"\n");
		}
		System.out.println("****************************************");
		
		List<Employee> listByYear=controller.getEmployeeByRegistrationYear(new SimpleDateFormat("yyyy-MM-dd").parse("2022-07-22"));
		System.out.println("Total no of record fetch is::"+listByYear.size());
		for(Employee empsByYear:listByYear) {
			System.out.print(empsByYear.getEid()+"  "+empsByYear.getEname()+"  "+empsByYear.getEaddress()+"  "+empsByYear.getEntryTime()+" \n");
		}
		System.out.println("****************************************");
		
		Iterable<IScalar> iemp=controller.getEmployeeBySal(2505.0);
		System.out.println("Get ONe EMployee by sal ::");
		iemp.forEach(emp->{
			System.out.println(emp.getEid()+"  "+emp.getEname()+" "+emp.getEaddress());
			System.out.println("IMplementation class name is::"+emp.getClass());
		});
		System.out.println("****************************************");
		
	}

}
