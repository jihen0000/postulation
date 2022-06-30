package com.enit.demo.dao;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.enit.demo.entities.Career;

@RepositoryRestResource
public interface CareerRepository extends MongoRepository<Career,String> {
	public Career findCarByuserName(String userName);

}
