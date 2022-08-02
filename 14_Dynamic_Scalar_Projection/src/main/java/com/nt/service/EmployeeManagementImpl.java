package com.nt.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nt.proxy.FirstImpl;
import com.nt.proxy.SecondImpl;
import com.nt.reposetory.IEmployeeRepo;


@Service("empservice")
public class EmployeeManagementImpl implements IEmployeeServiceMangement {
	
	@Autowired
	private IEmployeeRepo repo;

	@Override
	public List<SecondImpl> getEmployeeHavingLetter(String c,Class<SecondImpl> clazz) {
		List<SecondImpl> listService=repo.findByEnameIs(c,clazz);
		return listService;
	}



}
