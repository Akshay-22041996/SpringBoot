package com.nt.models;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import lombok.Data;

@Data
@Component("comp")
@ConfigurationProperties(prefix = "details.company")
public class Company {

	private String comName;
	private String type;
	private Integer size;
	private String location;
	private Employee emp;
	
}
