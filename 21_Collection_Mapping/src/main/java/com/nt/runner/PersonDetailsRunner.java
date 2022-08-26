package com.nt.runner;

import java.util.List;
import java.util.Map;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.nt.entity.PersonDetails;
import com.nt.service.IPersonServiceManagement;

@Component
public class PersonDetailsRunner implements CommandLineRunner {
	
	@Autowired
	private IPersonServiceManagement service;

	@Override
	public void run(String... args) throws Exception {
		PersonDetails pd= new PersonDetails(2, "Manish", List.of("Akshay", "Shubham", "Shekhar"), Set.of(858582545L, 12325255L), Map.of("Aaharno", "112525252", "PanNo", "DZ**4379D"));
		/*	String msg=service.registerPersonDetails(pd);
			System.out.println(msg);*/
		
		PersonDetails per=service.fetchPersonById(47);
		System.out.println(per);

	}

}
