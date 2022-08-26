package com.nt.service;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Scanner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nt.entity.ApplicationForm;
import com.nt.reposetory.IApplicationFormReposetory;

@Service("applicationservice")
public class ApplicationFormServiceImpl implements IApplicationFormService {
	
	@Autowired
	private IApplicationFormReposetory repo;

	@Override
	public String registerDetails(ApplicationForm af1){
		repo.save(af1);
		
		return "The Application registration number is::"+af1.getAid();
	}

}
