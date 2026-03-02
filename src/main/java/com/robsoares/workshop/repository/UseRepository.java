package com.robsoares.workshop.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.robsoares.workshop.domain.User;

@Repository
public interface UseRepository extends MongoRepository<User, String>{

}
