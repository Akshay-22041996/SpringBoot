package com.nt.documents;

import java.time.LocalDateTime;

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
public class IdDetails {

	@Id
	private Integer pid;
	private String idtype;
	private String idNo;
	private LocalDateTime expairyDate;
	@Override
	public String toString() {
		return "IdDetails [pid=" + pid + ", idtype=" + idtype + ", idNo=" + idNo + ", expairyDate=" + expairyDate + "]";
	}
	
	
}
