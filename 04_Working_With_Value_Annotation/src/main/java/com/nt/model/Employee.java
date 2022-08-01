package com.nt.model;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import lombok.Data;

@Data
@Component("employee")
public class Employee {
	
	@Value("Male")
	private String gender;
	@Value("${emp.eid}")
	private Integer eid;
	@Value("${emp.name}")
	private String ename;
	@Value("${emp.address}")
	private String address;
	@Value("${emp.mob}")
	private Long mobNo;
	@Value("${emp.sal}")
	private Double sal;
	@Value("${emp.expan}")
	private Double expan;
	
	@Override
	public String toString() {
		return "Employee [gender=" + gender + ", eid=" + eid + ", ename=" + ename + ", address=" + address + ", mobNo="
				+ mobNo + ", sal=" + sal + ", expan=" + expan + "]";
	}
	
	
}
