package com.nt.runners;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class ZTest implements CommandLineRunner {

	@Override
	public void run(String... args) throws Exception {
		System.out.println("ZTest class without @Order anno implementing CLR");
	}

}
