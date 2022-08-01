package com.nt.service;

import java.util.Date;
import java.util.List;

import com.nt.model.Employee;
import com.nt.model.IScalar;

public interface IEmployeeServiceManagement {

	public Iterable<Employee> fetchEmployeeByletters(String letters);
	
	public Iterable<Employee> getEmployeeBySal(Double sal);
	
	public Iterable<Employee> getEmployeeHavingLetters(char letters);
	
	public Iterable<Employee> getEmployeeWhoseSalBetween(Double sal1,Double sal2);
	
	public Iterable<Employee> getEmployeeWhoseNameStartingWith(char chars);
	
	public List<Employee> getEmployeeWhosAddressStartWith(char chars);
	public List<Employee> fetchEmployeeByEntryTime(Date date);
	public Iterable<IScalar> getOneEmployeeBySal(Double sal);
}
