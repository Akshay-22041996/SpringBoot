package com.nt.runner;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.nt.controller.MainController;
import com.nt.reposetory.FirstImpl;
import com.nt.reposetory.SecondImpl;

@Component
public class EmployeeRunnerTest implements CommandLineRunner{

	@Autowired
	private MainController controller;

	@Override
	public void run(String... args) throws Exception {
		List<SecondImpl> list1=controller.getAllEmployeeByLetters("Jay", SecondImpl.class);
		list1.forEach(emp->{
			System.out.println(emp.ename());
		});
		
	}
	
}
