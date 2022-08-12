package com.nt.runner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.nt.service.IEmployeeService;

@Component
public class EmployeeRunner implements CommandLineRunner{
	
	@Autowired
	private IEmployeeService service;

	@Override
	public void run(String... args) throws Exception {
		try {
		String msg=service.transferMoney(1000, 3, 6605);
		System.out.println(msg);
		}catch(Exception e) {
		e.printStackTrace();
		}
	}

}
