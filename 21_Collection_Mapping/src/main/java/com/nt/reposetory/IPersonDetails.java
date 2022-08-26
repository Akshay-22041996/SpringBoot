package com.nt.reposetory;

import org.springframework.data.jpa.repository.JpaRepository;

import com.nt.entity.PersonDetails;

public interface IPersonDetails extends JpaRepository<PersonDetails, Integer> {

}
