package com.nt.service;

import java.util.List;

import com.nt.documents.Person;

public interface IPersonManagementService {

	
	public String registerPersonDetails(Person per);
	
	public List<Person> getAllPersonDetails();
}
