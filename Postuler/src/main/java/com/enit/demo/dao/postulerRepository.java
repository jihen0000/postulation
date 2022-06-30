package com.enit.demo.dao;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.enit.demo.entities.Postuler;

@RepositoryRestResource
public interface postulerRepository extends MongoRepository<Postuler,String> {
    public Postuler findByPosId(String posId);
}
