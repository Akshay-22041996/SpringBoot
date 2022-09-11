package com.nt.reposetory;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.nt.documents.IdDetails;

public interface IIdDetailsReposetory extends MongoRepository<IdDetails, Integer> {

}
