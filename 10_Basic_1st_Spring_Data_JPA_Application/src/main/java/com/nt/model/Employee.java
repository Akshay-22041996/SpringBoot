package com.nt.model;

import java.sql.Timestamp;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@Entity
@NoArgsConstructor
@Table(name = "employee")
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
