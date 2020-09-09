package com.oliveira.workshopmongo.repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.oliveira.workshopmongo.domain.Post;

public interface PostRepository extends MongoRepository<Post, String>{
 
	List<Post> findByTitleContainingIgnoreCase(String text);
}
