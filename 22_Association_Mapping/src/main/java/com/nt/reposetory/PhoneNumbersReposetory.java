package com.nt.reposetory;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.nt.entity.PersonDetails;
import com.nt.entity.PhoneNumbers;

public interface PhoneNumbersReposetory extends JpaRepository<PhoneNumbers, Integer> {
	
	@Query("Select per,location from PhoneNumbers where mobNo=:phoneNo")
	public PersonDetails getDetails(Long phoneNo);

}
