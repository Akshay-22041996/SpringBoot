package com.nt.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.stereotype.Service;

import com.nt.documents.Doctor;

@Service("doctorservice")
public class DoctorServiceImpl implements IDoctorManagementService {
	
	@Autowired
	private MongoTemplate template;

	@Override
	public String registerDoctorDetails(Doctor doc) {
		
		return template.save(doc).getDid()+" is registerd in our DB";
	}

	@Override
	public String registerBulkDoctorsDetails(List<Doctor> list) {
		int count=template.insert(list, Doctor.class).size();
		return count+" number of record is saved in DB";
	}

}
