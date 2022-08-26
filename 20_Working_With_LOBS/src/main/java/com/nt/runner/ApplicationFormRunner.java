package com.nt.runner;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Scanner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.nt.entity.ApplicationForm;
import com.nt.service.IApplicationFormService;

@Component
public class ApplicationFormRunner implements CommandLineRunner {

	@Autowired
	private IApplicationFormService service;
	@Override
	public void run(String... args) throws Exception {

		Scanner scn=new Scanner(System.in);
		System.out.print("Enter Applicant Name::");
		String name=scn.next();
		
		System.out.print("Enter Date and Time of application(yyyy-MM-ddThh:mm:ss)::");
		String adt=scn.next();
		System.out.print("Enter Date of application(yyyy-MM-dd)::");
		String ad=scn.next();
		System.out.print("Applicant is Married (true/false)::");
		Boolean ms=scn.nextBoolean();
		System.out.print("Brose photo of applicant::");
		String aphoto=scn.next().trim();
		System.out.print("Browse resume of applicant::");
		String aresume=scn.next().trim();
		
			File file1=new File(aphoto);
			FileInputStream fis=new FileInputStream(file1);
			byte[] photoContent=new byte[(int) file1.length()];
			fis.read(photoContent);
			
		
		File file2 =new File(aresume);
		FileReader reader=new FileReader(file2);
		char[] resumeContent=new char[(int) file2.length()];
		reader.read(resumeContent);
		
		
		ApplicationForm af=new ApplicationForm();
		
		af.setApplicantName(name);
		af.setApplicantPhoto(photoContent);
		af.setApplicationResume(resumeContent);
		af.setApplicationDate(LocalDate.parse(ad));
		af.setDataandTimeofApplication(LocalDateTime.parse(adt));
		af.setIsMarried(ms);
		try {
	   String msg= service.registerDetails(af);
	    System.out.println(msg);
		}catch (Exception e) {
			e.printStackTrace();
			fis.close();
			reader.close();
		}

	}

}
