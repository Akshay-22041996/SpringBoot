package com.nt.reposetory;

import org.springframework.data.repository.CrudRepository;

import com.nt.model.Employee;

public interface IEmployeeReposetory extends CrudRepository<Employee, Integer> {

}
