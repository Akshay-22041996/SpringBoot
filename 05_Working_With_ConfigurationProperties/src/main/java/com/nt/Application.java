package com.nt;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.nt.models.Company;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
	ApplicationContext ac=	SpringApplication.run(Application.class, args);
	
	Company company=ac.getBean("comp", Company.class);
	
	System.out.println(company);
	}

}
