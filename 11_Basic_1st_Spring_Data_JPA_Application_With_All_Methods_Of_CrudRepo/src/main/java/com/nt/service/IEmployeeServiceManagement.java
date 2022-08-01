package com.nt.service;

import java.util.Optional;

import com.nt.model.Employee;

public interface IEmployeeServiceManagement {

		public String registerEmployee(Employee emp	);
		public String registerGroupOfEmployee(Iterable<Employee> emp);
		public long getTotalCountOfEmployee();
		public Iterable<Employee> getAllEmployeeRecord();
			/*public boolean verifyEmployeeAvailability(int eid);
		public Iterable<Employee> getMultipleEmployeeByIds(Iterable<Integer> eid);
		public Optional<Employee> getEmployeeById(int id);
		public Employee showEmployeeById(int eid);
		public String partialEmployeeDetailsUpdate(int id,Double sal);
		public String fullEmployeeDetailsUpdate(Employee emp);
		public String saveOrUpdateEmployee(Employee emp);
		public String removeEmployeeById(int eid);
		public String removeEmployee(Employee emp);
		public String removeAllEmployee();
		public String removeEmployeeByIds(Iterable<Integer> eid	);
		*/
}
