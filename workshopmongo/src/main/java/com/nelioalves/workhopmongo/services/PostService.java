package com.nelioalves.workhopmongo.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nelioalves.workhopmongo.domain.Post;
import com.nelioalves.workhopmongo.domain.User;
import com.nelioalves.workhopmongo.dto.UserDTO;
import com.nelioalves.workhopmongo.repository.PostRepository;
import com.nelioalves.workhopmongo.repository.UserRepository;
import com.nelioalves.workhopmongo.services.exception.ObjectNotFoundException;

@Service
public class PostService {

	@Autowired
	private PostRepository repo;  
	
	public Post findById(String id) {
		Optional<Post> user = repo.findById(id);
		return user.orElseThrow(() -> new ObjectNotFoundException("Post não encontrado"));
	}	
}
