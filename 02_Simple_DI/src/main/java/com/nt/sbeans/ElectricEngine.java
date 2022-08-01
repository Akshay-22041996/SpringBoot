package com.nt.sbeans;

import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("eengg")
@Scope("prototype")
public class ElectricEngine implements IEngine {
	
	

	public ElectricEngine() {
		System.out.println("ElectricEngine::0 param constructor");
	}

	@Override
	public void start() {
		System.out.println("ElectricEngine.:: start jurney");

	}

	@Override
	public void end() {
		System.out.println("ElectricEngine.:: end jurney");

	}

}
