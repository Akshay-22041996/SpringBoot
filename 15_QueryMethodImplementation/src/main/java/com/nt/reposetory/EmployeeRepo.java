package com.nt.reposetory;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.nt.model.Employee;

public interface EmployeeRepo extends JpaRepository<Employee, Integer> {

	
	@Query("from Employee where ename=:s")
	public List<Employee> fetchEmployeesByName(String s);
	
	@Query("from Employee where ename like :s%")
	public List<Employee> fetchEmployeesByLetters(String s);
	
	@Query("from Employee where ename like %:c%")
	public List<Employee> fetchEmployeesContaining(char c);
	
	@Query("select eid,ename,sal,entryTime from Employee where eaddress=:add")
	public List<Object> fetchEmployeeByAddress(String add);
	
	
	//@Query("select eid,ename,sal from Employee where sal between :sal1 and :sal2")
	//@Query("select eid,ename,sal from Employee where sal between ?1 and ?2")
	@Query("select eid,sal,ename from Employee where sal between :salary1 and :salary2")
	public List<Object[]> fetchEmployeeBetweenSal(@Param("salary1")Double sal1,@Param("salary2") Double sal2);
	
	@Query("from Employee where eid=:id")
	public Employee fetchEmployeeById(int id);
	
	@Query("select ename from Employee where eaddress=:address")
	public List<String> getEname(String address);
}
