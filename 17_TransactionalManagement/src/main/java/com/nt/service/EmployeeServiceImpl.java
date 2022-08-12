package com.nt.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.nt.reposetory.IEmployeeReposetory;

@Service("employeeservice")
public class EmployeeServiceImpl implements IEmployeeService {
	
	@Autowired
	private IEmployeeReposetory repo;

	@Override
	@Transactional
	public String transferMoney(int srcid, int desid, double amt) {
		
	 int result1=	repo.withDrawMoney(srcid, amt);
	int result2=	repo.depositMoney(desid, amt);
	
	if(result1 ==0 || result2 ==0)
		throw new IllegalArgumentException("Amount not valid");
		return "The "+amt+ "is transfer from "+srcid +" to "+desid;
	}

}
