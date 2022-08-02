package com.nt.runner;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.nt.controller.MainController;
import com.nt.proxy.FirstImpl;
import com.nt.reposetory.IEmployeeRepo;

@Component
public class EmployeeRunnerTest implements CommandLineRunner{

	@Autowired
	private MainController controller;
	
	@Autowired
	private IEmployeeRepo repo;

	@Override
	public void run(String... args) throws Exception {
	
		
	}
}
