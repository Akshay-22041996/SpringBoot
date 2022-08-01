package com.nt.sbeans;

import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("wmg")
public class WishMessageGenerator {
	
	@Autowired
	private LocalDateTime ldt;
	
	public String getMessage(String user) {
		int hour=ldt.getHour();
		System.out.println("\nTime in 24 hours format::"+hour+" hour "+ ldt.getMinute()+ " min "+ldt.getSecond()+" sec");
		
		if(hour<12)
			return "Good Morning::"+user;
		else if(hour<16)
			return "Good Afternoon::"+user;
		else if(hour<20)
			return "Good evening::"+user;
		else
			return "Good night";
	}
}
