package com.nelioalves.workhopmongo.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.nelioalves.workhopmongo.domain.User;

@Repository
public interface UserRepository extends MongoRepository<User, String>{

}
