package com.nt.reposetory;

import org.springframework.data.repository.CrudRepository;

import com.nt.model.Employee;

public interface CustomReposetory extends CrudRepository<Employee, Integer> {

}
