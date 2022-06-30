package com.enit.demo.dao;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.enit.demo.entities.Certification;

@RepositoryRestResource
public interface certificationRepository extends MongoRepository<Certification,String> {
    public Certification findByCerName(String cerName);
}
