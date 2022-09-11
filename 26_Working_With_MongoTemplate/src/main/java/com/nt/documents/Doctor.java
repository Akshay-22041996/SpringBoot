package com.nt.documents;

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
	private String email;
	private Double sal;
	@Version
	private Integer modificationDone;
}
