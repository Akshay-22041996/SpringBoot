package com.nt.reposetory;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.nt.documents.DrivingLicence;

public interface IDrivingLicenceReposetory extends MongoRepository<DrivingLicence, Integer> {

}
