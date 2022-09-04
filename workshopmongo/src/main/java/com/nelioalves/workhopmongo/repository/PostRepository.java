package com.nelioalves.workhopmongo.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.nelioalves.workhopmongo.domain.Post;

@Repository
public interface PostRepository extends MongoRepository<Post, String>{

}