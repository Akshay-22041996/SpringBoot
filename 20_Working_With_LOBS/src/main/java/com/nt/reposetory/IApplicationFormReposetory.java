package com.nt.reposetory;

import org.springframework.data.jpa.repository.JpaRepository;

import com.nt.entity.ApplicationForm;

public interface IApplicationFormReposetory extends JpaRepository<ApplicationForm, Integer>{

	
}
