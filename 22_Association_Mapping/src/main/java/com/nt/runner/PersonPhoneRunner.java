package com.nt.runner;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.nt.entity.PersonDetails;
import com.nt.entity.PhoneNumbers;
import com.nt.service.IPersonPhoneServiceManagement;

@Component
public class PersonPhoneRunner implements CommandLineRunner {

	@Autowired
	private IPersonPhoneServiceManagement service;
	@Override
	public void run(String... args) throws Exception {
		/*	PersonDetails pd=new PersonDetails();
		pd.setPname("Rahul");pd.setPlocation("Pune");
		
		PhoneNumbers pn=new PhoneNumbers();
		pn.setLocation("Village");pn.setProvider("Jio");pn.setMobNo(1234575872L);
		PhoneNumbers pn1=new PhoneNumbers();
		pn1.setLocation("City");pn1.setProvider("Uninor");pn1.setMobNo(111512452L);
		Set<PhoneNumbers> set=new HashSet();
		set.add(pn1);set.add(pn);
		pd.setPhone(set);
		try {
			String msg=service.registerThroughPerson(pd);
			System.out.println(msg);
		}catch(Exception e) {
			e.printStackTrace();
		}*/
		
		/*	//Inserting or save records with the help of child 
			PersonDetails details=new PersonDetails();
			details.setPlocation("Bangulore");details.setPname("Mayur");
			PhoneNumbers phone=new PhoneNumbers();
			phone.setLocation("RentHouse");phone.setMobNo(4748452L);phone.setProvider("Idea");phone.setPer(details);
			PhoneNumbers phone1=new PhoneNumbers();
			phone1.setLocation("OwnHouse");phone1.setMobNo(32125452L);phone1.setProvider("Vi");phone1.setPer(details);
			PhoneNumbers phone2=new PhoneNumbers();
			phone2.setLocation("nebourghHouse");phone2.setMobNo(45215452L);phone2.setProvider("Telecom");phone2.setPer(details);
			Set<PhoneNumbers> setPhone=new HashSet<>();
			setPhone.add(phone2);setPhone.add(phone);setPhone.add(phone1);
			
			try {
				String msg=service.registerThroughPhone(setPhone);
				System.out.println(msg);
			}catch(Exception e) {
				e.printStackTrace();
			}*/
		
	//	PersonDetails detail=service.getPersonDetailsById(130);System.out.println(detail);System.out.println(detail.getPhone());
//		System.out.println(detail.getPname()+"  "+detail.getPid()+"  "+detail.getPlocation());
//		detail.getPhone().forEach(System.out::println);
		
	/*	Iterable<PhoneNumbers> list=service.getAllPhoneNumbers();
		list.forEach(ph->{
			System.out.println("List of phone numbers::"+ph);
			System.out.println("Parent details");
			System.out.println(ph.getPer());
		});
	*/
		
		PersonDetails det=service.getPersonDetailsByUsingPhone(4748452L);
		if(det !=null) {
			System.out.println(det.getPlocation()+" ****"+det.getPname());
		}
	}

}
