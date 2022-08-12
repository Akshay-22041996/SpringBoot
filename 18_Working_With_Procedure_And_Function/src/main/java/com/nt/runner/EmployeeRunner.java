package com.nt.runner;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.ParameterMode;
import javax.persistence.StoredProcedureQuery;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.nt.model.Employee;

@Component
public class EmployeeRunner implements CommandLineRunner {
	
	@Autowired
	private EntityManager manager;

	@Override
	public void run(String... args) throws Exception {
		
		StoredProcedureQuery query=manager.createStoredProcedureQuery("P_EMPLOYEE_PROCEDURE",Employee.class);
		query.registerStoredProcedureParameter(1, String.class, ParameterMode.IN);
		query.registerStoredProcedureParameter(2, String.class, ParameterMode.IN);
		query.registerStoredProcedureParameter(3, Employee.class, ParameterMode.REF_CURSOR);
		
		query.setParameter(1, "Ajay");
		query.setParameter(2, "Vijay");
		
		List<Employee> list=query.getResultList();
		
		list.forEach(System.out::println);

	}

}
