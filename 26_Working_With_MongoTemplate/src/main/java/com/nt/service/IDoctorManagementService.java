package com.nt.service;

import java.util.List;

import com.nt.documents.Doctor;

public interface IDoctorManagementService {

	public String registerDoctorDetails(Doctor doc);
	
	public String registerBulkDoctorsDetails(List<Doctor> list);
}
