package com.nt.model;

import java.sql.Timestamp;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import lombok.Data;


@Entity
@Data
public class Employee {

	@Id
	@GeneratedValue
	private Integer eid;
	private String ename;
	private String eaddress;
	private Double sal;
	@UpdateTimestamp
	private Timestamp updateTime;
	@CreationTimestamp
	private Timestamp entryTime;
}
