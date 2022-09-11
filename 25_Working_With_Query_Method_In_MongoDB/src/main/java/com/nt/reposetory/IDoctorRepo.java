package com.nt.reposetory;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

import com.nt.entity.Doctor;

public interface IDoctorRepo extends MongoRepository<Doctor, String>{
	
	
	@Query( value = "{sal:{$gte:?0,$lte:?1}}")
	public List<Doctor> getDoctorBySal(Double sal1,Double sal2);
	
	@Query(fields = "{sal:1,email:1,dname:1}",value="{dname:{'$regex':?0}}")
	public List<Object[]> getSpecificRecord(String startWith);
	
	@Query(fields ="{dname:1,email:1,sal:1,did:0}",value = "{sal:?0}")
	public List<Object[]> getDoctorWhoseSal(Double sal);

}
