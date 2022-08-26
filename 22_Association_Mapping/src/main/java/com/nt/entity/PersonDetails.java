package com.nt.entity;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name="PersonDetails1")
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class PersonDetails {
	
	@Id
	@GeneratedValue
	private Integer pid;
	private String pname;
	private String plocation;
	@OneToMany(cascade = CascadeType.ALL,fetch = FetchType.LAZY,targetEntity = PhoneNumbers.class)
	@JoinColumn(name="Bridge",referencedColumnName = "pid")
	private Set<PhoneNumbers> phone;
	@Override
	public String toString() {
		return "PersonDetails [pid=" + pid + ", pname=" + pname + ", plocation=" + plocation + "]";
	}
	
	
	
}
