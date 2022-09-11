package com.nt.runner;

import java.time.LocalDateTime;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.nt.documents.Doctor;
import com.nt.service.IDoctorManagementService;

@Component
public class DoctorRunner implements CommandLineRunner {

	@Autowired
	private IDoctorManagementService service;
	
	@Override
	public void run(String... args) throws Exception {
		Doctor doc=new Doctor();Doctor doc1=new Doctor();Doctor doc2=new Doctor();
		doc.setDname("Alia");doc.setDob(LocalDateTime.of(2014, 04, 21, 20, 35));doc.setEmail("alia@gmail.com");doc.setSal(9020.0);
		doc1.setDname("Moni");doc1.setDob(LocalDateTime.of(2013, 04, 21, 20, 35));doc1.setEmail("moni@gmail.com");doc1.setSal(9020.0);
		doc2.setDname("Nagaarjun");doc2.setDob(LocalDateTime.of(2017, 04, 21, 20, 35));doc2.setEmail("nagaarjun@gmail.com");doc2.setSal(19020.0);
		/*String msg=service.registerDoctorDetails(doc);
		System.out.println(msg);*/
		
		String msg=service.registerBulkDoctorsDetails(List.of(doc, doc1, doc2));
		System.out.println(msg);
	}

}
