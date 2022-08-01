package com.nt.controller;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.nt.model.Employee;
import com.nt.model.IScalar;
import com.nt.service.IEmployeeServiceManagement;

@Controller("employeecontroller")
public class EmployeeControllerClass {

	@Autowired
	private IEmployeeServiceManagement service;
	
	public Iterable<Employee> getLikeEmployee(String letters){
		Iterable<Employee> listOfEmployee=service.fetchEmployeeByletters(letters);
		return listOfEmployee;
	}
	
	public Iterable<Employee> getEmployeesByMaxSal(Double sal){
		Iterable<Employee> listOfEmp=service.getEmployeeBySal(sal);
		return listOfEmp;
	}
	
	public Iterable<Employee> getEmployeeByLetters(char words){
		Iterable<Employee> listOfHavingWordEmployee=service.getEmployeeHavingLetters(words);
		return listOfHavingWordEmployee;
	}
	
	public Iterable<Employee> getEmployeeWhosSalBetween(Double sal1,Double sal2){
		Iterable<Employee> getEmployee=service.getEmployeeWhoseSalBetween(sal1, sal2);
		return getEmployee;
	}
	
	public Iterable<Employee> getEmployeeWhosNameStartWith(char chars){
		Iterable<Employee> listOfEmployeestartWith=service.getEmployeeWhoseNameStartingWith(chars);
		return listOfEmployeestartWith;
	}
	
	public List<Employee> getEmployeeByInitialAddressByLetter(char chars) {
		List<Employee> listOfEmps=service.getEmployeeWhosAddressStartWith(chars);
		
		return listOfEmps;
	}
	
	public List<Employee> getEmployeeByRegistrationYear(Date year){
		List<Employee> listOfEmps=service.fetchEmployeeByEntryTime(year);
		return listOfEmps;
	}
	
	public Iterable<IScalar> getEmployeeBySal(Double sal) {
		Iterable<IScalar> is=service.getOneEmployeeBySal(sal);
		return is;
	}
}
