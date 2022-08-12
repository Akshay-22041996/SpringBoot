package com.nt.reposetory;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

import com.nt.model.Employee;


public interface IEmployeeReposetory extends JpaRepository<Employee, Integer> {
	
	@Query("update Employee set sal=sal-:amount where eid=:srcid")
	@Modifying
	public int withDrawMoney(int srcid,double amount);
	
	@Query("update Employee set sal=sal+:amount where eid=:dstid")
	@Modifying
	public int depositMoney(int dstid,double amount);

}
