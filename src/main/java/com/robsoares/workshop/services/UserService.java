package com.robsoares.workshop.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.robsoares.workshop.config.dto.UserDTO;
import com.robsoares.workshop.domain.User;
import com.robsoares.workshop.repository.UseRepository;
import com.robsoares.workshop.services.exception.ObjectNotFoundException;

@Service
public class UserService {

	@Autowired
	private UseRepository repo;
	
	public List<User> findAll() {
		return repo.findAll();
	}
	
	public User findById(String id) {
		return repo.findById(id)
				.orElseThrow(() -> new ObjectNotFoundException("Objeto não encontrado"));
	}
	
	public User insert(User obj) {
		return repo.insert(obj);
	}
	
	public User fromDTO(UserDTO objDto) {
		return new User(objDto.getId(), objDto.getName(), objDto.getEmail());
	}
}
