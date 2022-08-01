package com.nt.service;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.domain.Sort.Direction;
import org.springframework.stereotype.Service;

import com.nt.model.Employee;
import com.nt.reposetory.IEmployeeRepo;

@Service("employeeservice")
public class EmployeeServiceImpl implements IEmployeeServiceMangement {
	
	@Autowired
	private IEmployeeRepo repo;

	@Override
	public Iterable<Employee> getAllEmployeeBySorting(boolean bo,String... properties) {
		
		Sort sort=Sort.by(bo?Direction.ASC:Direction.DESC	, properties);
		
		Iterable<Employee> list=repo.findAll(sort);
		return list;
	}

	@Override
	public Page<Employee> getByPage(int pageno,int pagesize) {
		 Pageable pageable=PageRequest.of(pageno,pagesize);
		Page<Employee> page=repo.findAll(pageable);
		 return page;
	}

	@Override
	public Page<Employee> getByOlyDirection(int pageno, int pagesize, Direction dir, String... properties) {
		Pageable pageable2=PageRequest.of(pageno, pagesize, dir, properties);
		
		Page<Employee> page3=repo.findAll(pageable2);
		return page3;
	}

	@Override
	public Page<Employee> getByDirection(int pageno, int pagesize, boolean bo, String... properties) {
		Sort sort1=Sort.by(bo?Direction.ASC:Direction.DESC, "eid");
		Pageable pageable2=PageRequest.of(pageno, pagesize, sort1);
		Page<Employee> page2=repo.findAll(pageable2);
		return page2;
	}


}
