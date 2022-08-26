package com.nt.service;

import java.util.List;
import java.util.Optional;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nt.entity.PersonDetails;
import com.nt.entity.PhoneNumbers;
import com.nt.reposetory.PersonDetailsReposetory;
import com.nt.reposetory.PhoneNumbersReposetory;

@Service("service")
public class PersonPhoneServiceImpl implements IPersonPhoneServiceManagement {
	
	@Autowired
	private PersonDetailsReposetory perRepo;
	
	@Autowired
	private PhoneNumbersReposetory phoRepo;

	@Override
	public String registerThroughPerson(PersonDetails per) {
		perRepo.save(per);
		return "Person is registered with id value is::"+per.getPid();
	}

	@Override
	public String registerThroughPhone(Set<PhoneNumbers> ph) {
		int count=phoRepo.saveAll(ph).size();
		return "No of records is registered is::"+count;
	}

	@Override
	public PersonDetails getPersonDetailsById(int id) {
		Optional<PersonDetails> opt=perRepo.findById(id);
		opt.orElseThrow((()->new IllegalArgumentException("Record not found")));
		return opt.get();
	}

	@Override
	public Iterable<PhoneNumbers> getAllPhoneNumbers() {
		Iterable<PhoneNumbers> itr=phoRepo.findAll();
		return itr;
	}

}
