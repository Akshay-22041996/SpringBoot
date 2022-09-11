package com.nt.documents;

import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.Map;
import java.util.Set;

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
public class Person {
	
	@Id
	private Integer pid;
	private String pname;
	private LocalDateTime dob;
	private String[] nickName;
	private Set<DrivingLicence> drLicenc;
	private Map<String,IdDetails> ids;
	@Override
	public String toString() {
		return "Person [pid=" + pid + ", pname=" + pname + ", dob=" + dob + ", nickName=" + Arrays.toString(nickName)
				+ "]";
	}
	
	

}
