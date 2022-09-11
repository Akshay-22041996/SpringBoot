package com.nt.runner;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.nt.document.Doctor;
import com.nt.service.IDoctorManagementService;

@Component
public class DoctorRunner implements CommandLineRunner {

	@Autowired
	private IDoctorManagementService service;
	@Override
	public void run(String... args) throws Exception {
		Doctor doc=new Doctor();Doctor doc1=new Doctor();Doctor doc2=new Doctor();Doctor doc3=new Doctor();
		doc.setDname("Piyush");doc.setDob(LocalDateTime.of(2014, 07, 23, 12, 12));doc.setEmail("piyush@gmail.com");doc.setSal(45623.0);
//saving perticular record 
		/*String msg=service.registerDoctorDetails(doc);
		System.out.println(msg);*/
//saving bulk records
		doc1.setDname("Gautham");doc1.setDob(LocalDateTime.now());doc1.setEmail("gautam@gmail.com");doc1.setSal(23153.0);
		doc2.setDname("Gambhir");doc2.setDob(LocalDateTime.of(2014, 06, 12, 12, 12));doc2.setEmail("gambhir@gmail.com");doc2.setSal(12525.0);
		doc3.setDname("Rani");doc3.setDob(LocalDateTime.of(LocalDate.of(2013, 06, 12), LocalTime.of(15, 15)));doc3.setEmail("rani@gmail.com");doc3.setSal(25325.0);
		/*	String msg=service.registerDoctorDetailsInBulk(List.of(doc, doc1, doc3, doc2));
			System.out.println(msg);*/
//Retringin doctor whose name is "Ranbir"	
		/*	List<Doctor> list=service.getDoctorByName("Ranbir");
			list.forEach(System.out::println);*/
//Retring all records from DB
		/*List<Doctor> list=service.getAllDoctorRecords();
		list.forEach(System.out::println);*/

//Retring records having Initial letter is "R";
		/*	List<Doctor> list=service.getAllDoctorRecordsHavingInitailChar("^P");
			list.forEach(System.out::println);
			System.out.println("********************");*/
//Retriving records having name ends with r
		/*List<Doctor> list1=service.getAllDoctorRecordsHavingInitailChar("r$");
		list1.forEach(System.out::println);*/
		
		/*Doctor record=service.validatingDoctorAvailability("Rani");
		System.out.println(record);*/
		
		/*	String msg1=service.modifySalary("Monii", 23125.0);
			System.out.println(msg1);*/
		String msg=service.modifyEmail("Ranbir1", "ranbir1@gmail.com");
		System.out.println(msg);
		
		
	}

}
