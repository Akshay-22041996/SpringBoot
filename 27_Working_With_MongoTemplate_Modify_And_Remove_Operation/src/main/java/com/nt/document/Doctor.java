package com.nt.document;

import java.time.LocalDateTime;

import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.Version;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;

@Document
@Data
public class Doctor {

	@Id
	private String did;
	private String dname;
	private LocalDateTime dob;
	private Double sal;
	private String email;
	@Version
	private Integer modificationDone;
}
