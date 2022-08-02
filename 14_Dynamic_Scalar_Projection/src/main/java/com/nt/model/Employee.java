package com.nt.model;

import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import lombok.Data;

@Data
public class Employee {
	@Id
	@GeneratedValue
	private Integer eid;
	@Column(length = 20)
	private String ename;
	@Column(length = 20)
	private String eaddress;
	private Double sal;
	private Timestamp entryTime;
	private Timestamp updateTime;
}
