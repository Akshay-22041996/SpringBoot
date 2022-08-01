package com.nt.models;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import lombok.Data;

@Data
@ConfigurationProperties(prefix = "details.company")
@Component("emp")
public class Employee {

	private Integer eid;
	private String ename;
	private String address;
	@Value("${sal}")
	private Double sal;
	private String[] nickName;
	private List<String> favColors;
	private Map<String,String> id;
	
}
