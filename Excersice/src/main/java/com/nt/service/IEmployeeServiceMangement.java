package com.nt.service;

import java.awt.print.Pageable;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Sort.Direction;

import com.nt.model.Employee;

public interface IEmployeeServiceMangement {

	public Iterable<Employee> getAllEmployeeBySorting(boolean bo,String... properties);
	public Page<Employee> getByPage(int pageno,int pagesize);
	public Page<Employee> getByDirection(int pageno,int pagesize,boolean bo,String...properties);
	public Page<Employee> getByOlyDirection(int pageno,int pagesize,Direction dir,String...properties);
}
