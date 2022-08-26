package com.nt.reposetory;

import org.springframework.data.jpa.repository.JpaRepository;

import com.nt.entity.BirthDetails;

public interface ChildReposetory extends JpaRepository<BirthDetails, Integer> {

}
