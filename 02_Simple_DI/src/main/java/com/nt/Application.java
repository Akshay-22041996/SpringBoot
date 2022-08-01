package com.nt;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ImportResource;
import org.springframework.context.annotation.PropertySource;

import com.nt.sbeans.Vehicle;

@SpringBootApplication
@ImportResource("com/nt/cfgs/applicationContext.xml")

public class Application {

	public static void main(String[] args) {
		 ApplicationContext ac=  SpringApplication.run(Application.class, args);
		 
		 Vehicle vechi=ac.getBean("vehicle", Vehicle.class);
		 
		 vechi.journey("Nagpur", "pune");
	}

}
