package com.nt.runners;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component("clrt")
public class CommandLineRunnerTest implements CommandLineRunner {

	@Override
	public void run(String... args) throws Exception {
		
		System.out.println("CommandLineRunnerTest Class executionstart");
		System.out.println("CommandLine runners are::");
		for(String val:args) {
			System.out.println(val);
		}

	}

}
