package com.nt.service;

import java.util.List;

import com.nt.document.Doctor;

public interface IDoctorManagementService {

	public String registerDoctorDetails(Doctor doc);
	
	public String registerDoctorDetailsInBulk(List<Doctor> listDoc);
	
	public List<Doctor> getDoctorByName(String name);
	public List<Doctor> getAllDoctorRecords();
	public List<Doctor> getAllDoctorRecordsHavingInitailChar(String chara);
	
	public Doctor validatingDoctorAvailability(String name);
	public String modifySalary(String name,Double newSal);
	public String modifyEmail(String name,String newEmail);
}
