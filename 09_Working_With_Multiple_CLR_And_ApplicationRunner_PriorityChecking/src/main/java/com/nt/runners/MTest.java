package com.nt.runners;

import org.springframework.boot.CommandLineRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Order(10)
public class MTest implements CommandLineRunner {

	@Override
	public void run(String... args) throws Exception {
		System.out.println("MTest class with @Order (10) implementing CLR");

	}

}
