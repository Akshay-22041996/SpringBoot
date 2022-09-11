package com.nt.documents;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Document
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class DrivingLicence {

	@Id
	private Integer driNo;
	private String type;
	private String category;
	@Override
	public String toString() {
		return "DrivingLicence [driNo=" + driNo + ", type=" + type + ", category=" + category + "]";
	}
	
	
}
