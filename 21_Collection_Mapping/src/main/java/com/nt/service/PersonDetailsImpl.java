package com.nt.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nt.entity.PersonDetails;
import com.nt.reposetory.IPersonDetails;

@Service("persondetailsservice")
public class PersonDetailsImpl implements IPersonServiceManagement {
	
	@Autowired
	private IPersonDetails repo;

	@Override
	public String registerPersonDetails(PersonDetails pd) {
		repo.save(pd);
		return "Person is registered with id value is::"+pd.getPid();
	}

	@Override
	public PersonDetails fetchPersonById(int id) {
		PersonDetails per= repo.findById(id).orElseThrow(()->new IllegalArgumentException("No record is found"));
		return per;
	}

}
