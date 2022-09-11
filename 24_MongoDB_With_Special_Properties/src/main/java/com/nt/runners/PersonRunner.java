package com.nt.runners;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.nt.documents.DrivingLicence;
import com.nt.documents.IdDetails;
import com.nt.documents.Person;
import com.nt.service.IPersonManagementService;

@Component
public class PersonRunner implements CommandLineRunner {
	
	@Autowired
	private IPersonManagementService service;

	@Override
	public void run(String... args) throws Exception {
		/*	
			DrivingLicence dl=new DrivingLicence(2204, "personal", "LWM");
			DrivingLicence dl1=new DrivingLicence(2205, "commercial", "HWM");
			DrivingLicence dl2=new DrivingLicence(2206, "Sharing", "TW");
			
			IdDetails id1=new IdDetails(1996, "PanCard", "DZBPK1252D", LocalDateTime.of(2010, 07, 23, 13, 15));
			IdDetails id2=new IdDetails(1997, "VoterCard", "ABCDK125", LocalDateTime.of(2017, 10, 23, 13, 16));
			
			
			Person per=new Person(1, "Raja", LocalDateTime.now(), new String[] {"King","prince"}, Set.of(dl, dl1, dl2), Map.of("Doc1", id1, "Doc2", id2));
			String msg=service.registerPersonDetails(per);
			System.out.println(msg);*/
		
		System.out.println("Retriving All person Details");
		List<Person> list=service.getAllPersonDetails();
		list.forEach(per->{
			System.out.println(per);
			System.out.println("Driving Licence details::");
			Set<DrivingLicence> dl=per.getDrLicenc();
			dl.forEach(dry->{
				System.out.println(dry);
			});
			Map<String,IdDetails> ma=per.getIds();
			ma.forEach((ke,val)->{
				System.out.println("Key is"+ke+"-->"+val);
			});
			
			
		});
	

	}

}
