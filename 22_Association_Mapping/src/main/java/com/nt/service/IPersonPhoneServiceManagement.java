package com.nt.service;

import java.util.Set;

import com.nt.entity.PersonDetails;
import com.nt.entity.PhoneNumbers;

public interface IPersonPhoneServiceManagement {

	public String registerThroughPerson(PersonDetails per);
	public String registerThroughPhone(Set<PhoneNumbers> ph);
	public PersonDetails getPersonDetailsById(int id);
	public Iterable<PhoneNumbers> getAllPhoneNumbers();
}
