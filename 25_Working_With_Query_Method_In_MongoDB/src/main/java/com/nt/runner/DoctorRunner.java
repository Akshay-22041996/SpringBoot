package com.nt.runner;

import java.time.LocalDateTime;
import java.util.Iterator;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.nt.controller.MainController;
import com.nt.entity.Doctor;

@Component("doctorrunner")
public class DoctorRunner implements CommandLineRunner {

	@Autowired
	private MainController controller;
	@Override
	public void run(String... args) throws Exception {
		/*	Doctor doc=new Doctor();
			doc.setDname("Prince");doc.setDob(LocalDateTime.of(2012, 05, 27, 13, 28));doc.setEmail("prince@gmail.com");doc.setSal(36200.0);
			String msg=controller.registerDoctorDetails(doc);
			System.out.println(msg);*/
			System.out.println("From runner class");
			/*List<Doctor> list=controller.getDoctorWhoseSalBetween(40000.0, 50000.0);
			for(Doctor doc:list) {
				System.out.println(doc);
			}*/
			/*	List<Object[]> list1=controller.getDoctorNameStart("R");
				list1.forEach(row->{
					for(Object val:row) {
						System.out.println(val);
					}
				});*/
			
			List<Object[]> list2=controller.getDoctorWhoseSal(36200.0);
			list2.forEach(row->{
				for(Object obj:row) {
					System.out.println(obj);
				}
			});
			
		

	}

}
