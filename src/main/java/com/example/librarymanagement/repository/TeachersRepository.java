package com.example.librarymanagement.repository;

import com.example.librarymanagement.model.Teachers;
import com.mongodb.Mongo;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface TeachersRepository extends MongoRepository<Teachers,Integer> {
}
