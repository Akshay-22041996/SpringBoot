package com.nt.runners;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class Example1 implements ApplicationRunner {

	@Override
	public void run(ApplicationArguments args) throws Exception {
		
		System.out.println("Example class without(Order anno) implementing AR");
		
//		System.out.println(args.getNonOptionArgs());
//		System.out.println(args.getOptionNames());
//		System.out.println(args.getOptionValues("Name"));
//		System.out.println(args.getOptionValues("Age"));
		

	}

}
