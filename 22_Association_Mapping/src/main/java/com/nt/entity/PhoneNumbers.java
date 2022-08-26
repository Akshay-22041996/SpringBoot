package com.nt.entity;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name="PhoneNumbers")
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class PhoneNumbers {
	@Id
	@GeneratedValue
	private Integer phoneid;
	private Long mobNo;
	private String provider;
	private String location;
	@ManyToOne(cascade = CascadeType.ALL,fetch = FetchType.LAZY,targetEntity = PersonDetails.class)
	@JoinColumn(name="Bridge",referencedColumnName = "pid")
	private PersonDetails per;
	@Override
	public String toString() {
		return "PhoneNumbers [phoneid=" + phoneid + ", mobNo=" + mobNo + ", provider=" + provider + ", location="
				+ location + "]";
	}
	
	
}
