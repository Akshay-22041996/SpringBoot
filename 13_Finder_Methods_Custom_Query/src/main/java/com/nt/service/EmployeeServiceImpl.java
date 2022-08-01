package com.nt.service;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nt.model.Employee;
import com.nt.model.IScalar;
import com.nt.reposetory.IEmployeeReposetory;

@Service("employeeservice")
public class EmployeeServiceImpl implements IEmployeeServiceManagement {
	
	@Autowired
	private IEmployeeReposetory repo;

	@Override
	public Iterable<Employee> fetchEmployeeByletters(String letters) {
		Iterable<Employee> list=repo.findByEnameIs(letters);
		return list;
	}

	@Override
	public Iterable<Employee> getEmployeeBySal(Double sal) {
		Iterable<Employee> listOfEmployee=repo.findBySalGreaterThanEqual(sal);
		return listOfEmployee;
	}

	@Override
	public Iterable<Employee> getEmployeeHavingLetters(char letters) {
		Iterable<Employee> listOfEmployeeHavingLetters=repo.findByEnameContaining(letters);
		return listOfEmployeeHavingLetters;
	}

	@Override
	public Iterable<Employee> getEmployeeWhoseSalBetween(Double sal1, Double sal2) {
		Iterable<Employee> getEmployeeSalBetween=repo.getBySalBetween(sal1, sal2);
		return getEmployeeSalBetween;
	}

	@Override
	public Iterable<Employee> getEmployeeWhoseNameStartingWith(char chars) {
		Iterable<Employee> listOfEmployee=repo.getByEnameStartingWith(chars);
		return listOfEmployee;
	}

	@Override
	public List<Employee> getEmployeeWhosAddressStartWith(char chars) {
		List<Employee> getEmplyeeByAddressStartWith=repo.getByEaddressIgnoreCaseStartingWith(chars);
		return getEmplyeeByAddressStartWith;
	}

	@Override
	public List<Employee> fetchEmployeeByEntryTime(Date date) {
		List<Employee> listBasedOnEntry=repo.findByEntryTimeGreaterThan(date);
		return listBasedOnEntry;
	}

	@Override
	public Iterable<IScalar> getOneEmployeeBySal(Double sal) {
	Iterable<IScalar> emp=repo.findBySal(sal);
		return emp;
	}

}
