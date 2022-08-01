package com.nt;

import java.time.LocalDateTime;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;

import com.nt.sbeans.WishMessageGenerator;

@SpringBootApplication
public class Application {
	
	@Bean
	public LocalDateTime createldt() {
		return LocalDateTime.now();
	}

	public static void main(String[] args) {
		ApplicationContext ac=SpringApplication.run(Application.class, args);
		
		WishMessageGenerator generator=ac.getBean("wmg", WishMessageGenerator.class);
		
		String msg=generator.getMessage("Akshay");
		System.out.println(msg);
		
		((ConfigurableApplicationContext) ac).close();
		
		
	}

}
