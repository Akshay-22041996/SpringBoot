package com.nt.runners;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class Test1 implements CommandLineRunner {

	@Override
	public void run(String... args) throws Exception {
		System.out.println("Test class without @Ordered  implementing CLR");
//		for(String val:args) {
//			System.out.println(val);
//		}
		

	}

}
