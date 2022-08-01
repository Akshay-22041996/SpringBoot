package com.nt;

import java.util.List;

import javax.sql.DataSource;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;

import com.nt.controller.MainController;
import com.nt.model.Employee;
import com.zaxxer.hikari.HikariDataSource;

@SpringBootApplication
public class Application {
	
//	@Bean
//	public DataSource createDataSource() {
//		HikariDataSource ds=new HikariDataSource();
//		ds.setDriverClassName("oracle.jdbc.driver.OracleDriver");
//		ds.setJdbcUrl("jdbc:oracle:thin:@localhost:1521:orcl");
//		ds.setUsername("akshay");
//		ds.setPassword("akshay");
//		return ds;
//	}

	public static void main(String[] args) {
		System.out.println("Starting application");
	ApplicationContext ac=	SpringApplication.run(Application.class, args);
	
	MainController controller=ac.getBean("mainController", MainController.class);
	
	
	try {
	System.out.println("in try");
	List<Employee> list=controller.showAllEmp("cleark", "Maneger","Salesman");
	System.out.println("in query");
	list.forEach(emp->{
		
		System.out.println(emp);
	});
	}catch (Exception e) {
	e.printStackTrace();
	
	
	}
	
	}

}
