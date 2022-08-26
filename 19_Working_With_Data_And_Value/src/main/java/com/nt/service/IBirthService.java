package com.nt.service;

import com.nt.entity.BirthDetails;

public interface IBirthService {

	public String saveBirthInfo(BirthDetails bd	);
	
	public BirthDetails fetchAllChildInfo();
}
