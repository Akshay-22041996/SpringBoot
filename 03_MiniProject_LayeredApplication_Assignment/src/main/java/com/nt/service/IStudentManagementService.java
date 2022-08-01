package com.nt.service;

import java.util.List;

import com.nt.model.StudentInfo;

public interface IStudentManagementService {
	
	public List<StudentInfo> fetchallStudent(String sub1,String sub2,String sub3) throws Exception;
}
