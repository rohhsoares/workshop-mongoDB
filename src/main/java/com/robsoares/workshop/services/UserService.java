package com.robsoares.workshop.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.robsoares.workshop.domain.User;
import com.robsoares.workshop.repository.UseRepository;

@Service
public class UserService {

	@Autowired
	private UseRepository repo;
	
	public List<User> findAll() {
		return repo.findAll();
	}
	
}
