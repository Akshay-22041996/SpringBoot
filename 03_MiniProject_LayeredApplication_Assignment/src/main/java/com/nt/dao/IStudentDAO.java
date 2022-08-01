package com.nt.dao;

import java.util.List;

import com.nt.model.StudentInfo;

public interface IStudentDAO {

	public List<StudentInfo> getStudent(String sub1,String sub2,String sub3) throws Exception;
}
