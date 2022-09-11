package com.nt.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nt.documents.Person;
import com.nt.reposetory.IPersonReposetory;

@Service("personService")
public class PersonServiceManagementImpl implements IPersonManagementService {

	@Autowired
	private IPersonReposetory perRepo;
	@Override
	public String registerPersonDetails(Person per) {
		
		return perRepo.save(per).getPid() +" is a registration number for person details ";
	}
	@Override
	public List<Person> getAllPersonDetails() {
		
		return perRepo.findAll();
	}

}
