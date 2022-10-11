package com.gustavoabreu.workshopmongo.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.gustavoabreu.workshopmongo.domain.Post;

@Repository
public interface PostRepository extends MongoRepository<Post, String> {

	
}