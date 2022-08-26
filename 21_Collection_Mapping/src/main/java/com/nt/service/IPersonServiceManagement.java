package com.nt.service;

import com.nt.entity.PersonDetails;

public interface IPersonServiceManagement {

	public String registerPersonDetails(PersonDetails pd);
	public PersonDetails fetchPersonById(int id);
}
