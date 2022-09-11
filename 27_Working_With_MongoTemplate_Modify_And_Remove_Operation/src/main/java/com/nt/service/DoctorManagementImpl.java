package com.nt.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.BasicQuery;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.data.mongodb.core.query.Update;
import org.springframework.stereotype.Service;

import com.nt.document.Doctor;

@Service("doctorservice")
public class DoctorManagementImpl implements IDoctorManagementService {

	@Autowired
	private MongoTemplate template;
	
	@Override
	public String registerDoctorDetails(Doctor doc) {
		
		return template.insert(doc).getDid()+" is a id value of given record insertion";
	}

	@Override
	public String registerDoctorDetailsInBulk(List<Doctor> listDoc) {
		int count=template.insertAll(listDoc).size();
		return count+" number of record is inserted in DB";
	}

	@Override
	public List<Doctor> getDoctorByName(String name) {
		Query query=new Query();
		query.addCriteria(Criteria.where("dname").is(name));
		
		List<Doctor> list= template.find(query, Doctor.class);
		return list;
	}

	@Override
	public List<Doctor> getAllDoctorRecords() {
		
		return template.findAll(Doctor.class);
	}

	@Override
	public List<Doctor> getAllDoctorRecordsHavingInitailChar(String chara) {
		Query query=new Query();
		query.addCriteria(Criteria.where("dname").regex(chara,"i"));
		List<Doctor> list=template.find(query, Doctor.class);
		return list;
	}

	@Override
	public Doctor validatingDoctorAvailability(String name) {
		Query query=new Query();
		query.addCriteria(Criteria.where("dname").in(name));
		Doctor result=template.findOne(query, Doctor.class);
		return result;
	}

	@Override
	public String modifySalary(String name,Double newSal) {
		Query query=new Query();
		query.addCriteria(Criteria.where("dname").is(name));
		Update update=new Update();
		update.set("sal", newSal);
		Doctor doc=template.findAndModify(query, update, Doctor.class);
		return doc==null?"Doctor record not found":"Record is modified";
	}

	@Override
	public String modifyEmail(String name, String newEmail) {
		Query query=new Query();
		query.addCriteria(Criteria.where("dname").is(name));
		Update update=new Update();
		update.set("email", newEmail);
		Doctor doc=template.findAndModify(query, update, Doctor.class);
		return doc==null?"Record not Found with given name":"Email is updated";
	}
	

}
