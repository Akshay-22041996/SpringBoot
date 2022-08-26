package com.nt.entity;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import lombok.Data;


@Entity
@Data
public class BirthDetails {
	@Id
	@GeneratedValue
	private Integer bid;
	private String cNickName;
	private LocalDate dob;
	private LocalTime tob;
	private LocalDateTime detailsOfBirth;

}
