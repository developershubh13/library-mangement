package com.example.librarymanagement.repository;

import com.example.librarymanagement.model.Students;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface StudentsRepository extends MongoRepository<Students,Integer> {

}
