package com.nt.reposetory;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.nt.model.Employee;
import com.nt.proxy.MainBranch;

public interface IEmployeeRepo extends JpaRepository<Employee, Integer> {
	
	public <T extends MainBranch> List<T> findByEnameIs(String letter,Class<T> clazz);

}
