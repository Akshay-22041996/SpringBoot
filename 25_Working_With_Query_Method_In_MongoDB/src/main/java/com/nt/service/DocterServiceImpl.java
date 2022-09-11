package com.nt.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nt.entity.Doctor;
import com.nt.reposetory.IDoctorRepo;

@Service("doctorservice")
public class DocterServiceImpl implements IDocterMangementService {
	
	@Autowired
	private IDoctorRepo docRepo;

	@Override
	public String saveDocterDetails(Doctor doc) {
		
		return docRepo.save(doc).getDid()+" is registered in our DB";
	}

	@Override
	public List<Doctor> getDoctorBetweenSal(Double sal1, Double sal2) {
		List<Doctor> doc1=docRepo.getDoctorBySal(sal1, sal2);
		System.out.println("from service class");
		return doc1;
	}

	@Override
	public List<Object[]> getDoctorNameStartWith(String initLetter) {
		
		return docRepo.getSpecificRecord(initLetter);
	}

	@Override
	public List<Object[]> getDoctorWhoseSal(Double sal) {
		
		return docRepo.getDoctorWhoseSal(sal);
	}

}
