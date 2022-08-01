package com.nt;

import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.nt.controller.MainController;
import com.nt.model.StudentInfo;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
	ApplicationContext ac=	SpringApplication.run(Application.class, args);
	
	MainController controller=ac.getBean("controller",MainController.class);
	
	try {
		List<StudentInfo> list=controller.showAllStudent("Marathi", "English", "chinese");
		list.forEach(emp->{
			System.out.println(emp);
		});
	}catch(Exception e){
		e.printStackTrace();
	}
	}

}
