package com.nt.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.nt.entity.Doctor;
import com.nt.service.IDocterMangementService;

@Controller("doctorcontroller")
public class MainController {
	
	@Autowired
	private IDocterMangementService service;

	/*public String registerDoctorDetails(Doctor doc) {
		System.out.println("From controller");
		return service.saveDocterDetails(doc);
	}*/
	
	public List<Doctor> getDoctorWhoseSalBetween(Double sal1,Double sal2) {
		System.out.println("From controller class");
		List<Doctor> list= service.getDoctorBetweenSal(sal1, sal2);
		return list;
	}
	
	public List<Object[]> getDoctorNameStart(String intialLetter){
		return service.getDoctorNameStartWith(intialLetter);
	}
	
	public List<Object[]> getDoctorWhoseSal(Double sal){
		return service.getDoctorWhoseSal(sal);
	}
}
