package com.nt.service;

import java.util.List;

import com.nt.entity.Doctor;

public interface IDocterMangementService {

	public String saveDocterDetails(Doctor doc);
	
	public List<Doctor> getDoctorBetweenSal(Double sal1,Double sal2);
	
	public List<Object[]> getDoctorNameStartWith(String initLetter);
	
	public List<Object[]> getDoctorWhoseSal(Double sal);
}
