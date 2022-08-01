package com.nt.model;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("company")
public class Company {
	
	@Value("${comp.name}")
	private String companyName;
	@Value("${comp.size}")
	private Integer size;
	@Value("${comp.type}")
	private String type;
	@Value("#{employee.sal+employee.expan}")
	private Double totalSal;
	
	@Override
	public String toString() {
		return "Company [companyName=" + companyName + ", size=" + size + ", type=" + type + ", totalSal=" + totalSal
				+ "]";
	}
	

}
