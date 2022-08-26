package com.nt.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nt.entity.BirthDetails;
import com.nt.reposetory.ChildReposetory;

@Service("birthservice")
public class BirthServiceImpl implements IBirthService {
	
	@Autowired
	private ChildReposetory repo;

	@Override
	public String saveBirthInfo(BirthDetails bd) {
		
		repo.save(bd);
		return "Children infomation is saved in DB with id no is::"+bd.getBid();
	}

	@Override
	public BirthDetails fetchAllChildInfo() {
		// TODO Auto-generated method stub
		return null;
	}

}
