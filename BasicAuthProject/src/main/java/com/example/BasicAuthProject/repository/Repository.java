package com.example.BasicAuthProject.repository;

import com.example.BasicAuthProject.model.Employee;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface Repository extends MongoRepository<Employee, String> {
}
