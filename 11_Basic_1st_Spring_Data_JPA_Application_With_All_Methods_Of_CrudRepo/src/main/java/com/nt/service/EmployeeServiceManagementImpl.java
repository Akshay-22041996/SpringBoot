package com.nt.service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nt.model.Employee;
import com.nt.reposetory.CustomReposetory;

@Service("employeeservice")
public class EmployeeServiceManagementImpl implements IEmployeeServiceManagement {

	@Autowired
	private CustomReposetory repo;
	
		//1.Method from IEmployeeServiceManagement interface registerEmployee(Employee emp	)
		@Override
		public String registerEmployee(Employee emp) {
			Employee createEmp=new Employee();
			createEmp.setEname(emp.getEname());
			createEmp.setEaddress(emp.getEaddress());
			createEmp.setSal(emp.getSal());
			
		//	repo.save(createEmp);
			return "Employee is registered with id value is::"+createEmp.getEid();
		}

		//2.Method from IEmployeeServiceManagement interface registerGroupOfEmployee(Iterable<Employee> emp)
		@Override
		public String registerGroupOfEmployee(Iterable<Employee> emp) {
		Iterable<Employee> listOfEmployee=repo.saveAll(emp);
		List<Employee> listOfIds=(List<Employee>) listOfEmployee;
		List<Integer> ids=listOfIds.stream().map(obj->obj.getEid()).collect(Collectors.toList());
		
//		List<Integer> ids=new ArrayList();
//		listOfIds.forEach(empo->{
//			
//			ids.add(empo.getEid());
//		});
			return "The group of employee is registered with id values is::"+ids;
		}

		//3.Method from IEmployeeServiceManagement interface getTotalCountOfEmployee() 
		@Override
		public long getTotalCountOfEmployee() {
			long count=repo.count();
			return count;
		}

		//4.Method from IEmployeeServiceManagement interface getAllEmployeeRecord() 
		@Override
		public Iterable<Employee> getAllEmployeeRecord() {

				Iterable<Employee> allEmp=repo.findAll();
			
			return allEmp;
		}
	
	

}
