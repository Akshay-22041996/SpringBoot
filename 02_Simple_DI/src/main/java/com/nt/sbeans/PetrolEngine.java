package com.nt.sbeans;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("pengg")
@Scope("prototype")
public class PetrolEngine implements IEngine {
	
	

	public PetrolEngine() {
		System.out.println("PetrolEngine::0 Param constructor");
	}

	@Override
	public void start() {
		System.out.println("PetrolEngine.:: start jurney");

	}

	@Override
	public void end() {
		System.out.println("PetrolEngine.:: end jurney");
	}

}
