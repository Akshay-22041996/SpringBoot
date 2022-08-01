package com.nt.sbeans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("vehicle")
@Scope("prototype")
public class Vehicle {
	
	@Autowired
	@Qualifier("engiType")

	private IEngine engine;

	public Vehicle() {
		System.out.println("Vehicle::0 param constructor");
	}
	
	public void journey(String start,String end) {
		System.out.println("\n\n\nJourney start point is::"+start);
		engine.start();
		System.out.println("Journey is going on");
		engine.end();
		System.out.println("Journey end point is::"+end);
	}
	
	
}
