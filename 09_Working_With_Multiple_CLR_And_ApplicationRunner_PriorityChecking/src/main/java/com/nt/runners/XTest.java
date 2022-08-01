package com.nt.runners;

import org.springframework.boot.CommandLineRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Order(9)
public class XTest implements CommandLineRunner {

	@Override
	public void run(String... args) throws Exception {
		System.out.println("XTest class With @Order(9) implementing CLR");

	}

}
