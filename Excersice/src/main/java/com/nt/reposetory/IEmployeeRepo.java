package com.nt.reposetory;

import org.springframework.data.repository.PagingAndSortingRepository;

import com.nt.model.Employee;

public interface IEmployeeRepo extends PagingAndSortingRepository<Employee, Integer>{

}
