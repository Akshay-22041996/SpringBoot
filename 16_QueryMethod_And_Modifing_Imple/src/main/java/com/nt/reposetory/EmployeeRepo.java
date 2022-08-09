package com.nt.reposetory;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.transaction.annotation.Transactional;

import com.nt.model.Employee;

@Transactional
public interface EmployeeRepo extends JpaRepository<Employee, Integer> {

	@Query("delete from Employee where eid=:employeeNo")
	@Modifying
	public int deleteEmployee(int employeeNo);
	
	@Query("from Employee e1 where 0=(select count(sal) from Employee e2 where e2.sal>e1.sal)")
	public Employee getHighestPayingEmployee();
	
	@Modifying
	@Query("update Employee set eaddress=:address where eid=:employeeId")
	public int updateEmployeeDetails(int employeeId,String address);
	
	@Modifying
	@Query("update Employee set eaddress=:address,sal=:salary where eid=:employeeId")
	public int updateCompleteEmployeeDetails(int employeeId,String address,double salary);
	
	@Query("select count(*) from Employee")
	public int countTotalEmployees();
	

}
