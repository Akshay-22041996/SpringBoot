package com.nt;

import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.nt.controller.MainController;
import com.nt.model.Employee;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
	ApplicationContext ac=	SpringApplication.run(Application.class, args);
	
	MainController mc=ac.getBean("controller", MainController.class);
	List<Employee> list=mc.getAllEmployeeByDesg("Maneger","Salesman","cleark");
	
	list.forEach(emp->{
		System.out.println(emp);
	});
	
	
	}

}
