package com.nt.reposetory;

import org.springframework.data.jpa.repository.JpaRepository;

import com.nt.entity.PhoneNumbers;

public interface PhoneNumbersReposetory extends JpaRepository<PhoneNumbers, Integer> {

}
