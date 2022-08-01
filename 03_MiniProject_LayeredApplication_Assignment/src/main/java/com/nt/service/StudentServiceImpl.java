package com.nt.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nt.dao.IStudentDAO;
import com.nt.model.StudentInfo;


@Service("service")
public class StudentServiceImpl implements IStudentManagementService {
	
	@Autowired
	private IStudentDAO dao;

	@Override
	public List<StudentInfo> fetchallStudent(String sub1, String sub2, String sub3) throws Exception {
		System.out.println("Service class::fetch method is executed");
		List<StudentInfo> list=dao.getStudent(sub1, sub2, sub3);
		return list;
	}

}
