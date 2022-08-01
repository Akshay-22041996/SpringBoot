package com.nt.reposetory;

import org.springframework.data.repository.PagingAndSortingRepository;

import com.nt.model.Employee;

public interface IPagingAndSortingRepo extends PagingAndSortingRepository<Employee, Integer> {

}
