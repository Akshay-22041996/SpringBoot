package com.nt.model;

import java.sql.Timestamp;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import lombok.Data;

@Data
@Entity
public class Employee {

	@Id
	@GeneratedValue
	private Integer eid;
	private String ename;
	private Double sal;
	@CreationTimestamp
	private Timestamp entryTime;
	@UpdateTimestamp
	private Timestamp updateTime;
	private String eaddress;
}
