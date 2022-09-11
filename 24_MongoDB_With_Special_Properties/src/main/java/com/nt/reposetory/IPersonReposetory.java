package com.nt.reposetory;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.nt.documents.Person;

public interface IPersonReposetory extends MongoRepository<Person, Integer> {

}
