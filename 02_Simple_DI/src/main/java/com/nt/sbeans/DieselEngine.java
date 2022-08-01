package com.nt.sbeans;

import org.springframework.stereotype.Component;

@Component("dengg")
public class DieselEngine implements IEngine {
	
	

	public DieselEngine() {
		System.out.println("DieselEngine::0 param constructor");
	}

	@Override
	public void start() {
		System.out.println("DieselEngine.:: start jurney");

	}

	@Override
	public void end() {
		System.out.println("DieselEngine.:: end jurney");

	}

}
