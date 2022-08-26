package com.nt.entity;

import java.io.Serializable;
import java.time.LocalDate;
import java.time.LocalDateTime;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Lob;

import lombok.Data;

@Entity
@Data
public class ApplicationForm implements Serializable{

	@Id
	@GeneratedValue
	private Integer aid;
	private String applicantName;
	private LocalDate applicationDate;
	private LocalDateTime dataandTimeofApplication;
	private Boolean isMarried;
	@Lob
	private byte[] applicantPhoto;
	@Lob
	private char[] applicationResume;
}
