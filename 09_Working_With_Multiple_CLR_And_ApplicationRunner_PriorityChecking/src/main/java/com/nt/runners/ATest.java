package com.nt.runners;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class ATest implements CommandLineRunner {

	@Override
	public void run(String... args) throws Exception {
		System.out.println("ATest class without @Order implementing CLR");
	}

}
