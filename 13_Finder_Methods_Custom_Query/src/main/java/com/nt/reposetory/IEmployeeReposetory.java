package com.nt.reposetory;

import java.util.Date;
import java.util.List;

import org.springframework.data.repository.PagingAndSortingRepository;

import com.nt.model.Employee;
import com.nt.model.IScalar;

public interface IEmployeeReposetory extends PagingAndSortingRepository<Employee, Integer> {
	
	public Iterable<Employee> findByEnameIs(String ename);
	public Iterable<Employee> findBySalGreaterThanEqual(Double sal);
	public Iterable<Employee> findByEnameContaining(char chars);
	public Iterable<Employee> getBySalBetween(Double sal1,Double sal2);
	public Iterable<Employee> getByEnameStartingWith(char chars);
	
	public List<Employee> getByEaddressIgnoreCaseStartingWith(char chars);
	public List<Employee> findByEntryTimeGreaterThan(Date date);
	public Iterable<IScalar> findBySal(Double sal);
}
