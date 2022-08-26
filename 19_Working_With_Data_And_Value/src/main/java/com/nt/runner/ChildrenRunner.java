package com.nt.runner;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.nt.entity.BirthDetails;
import com.nt.service.IBirthService;

@Component
public class ChildrenRunner implements CommandLineRunner {
	
	@Autowired
	private IBirthService service;

	@Override
	public void run(String... args) throws Exception {
		BirthDetails bd=new BirthDetails();
		bd.setCNickName("Baby Girl");
		bd.setDetailsOfBirth(LocalDateTime.of(2015, 7, 30, 22, 3, 6));
		bd.setDob(LocalDate.of(2016, 04, 22));
		bd.setTob(LocalTime.of(22, 40, 27));
	
		String msg=service.saveBirthInfo(bd);
		System.out.println(msg);

	}

}
