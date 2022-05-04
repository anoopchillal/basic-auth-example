package com.example.BasicAuthProject.service;

import com.example.BasicAuthProject.model.Employee;
import com.example.BasicAuthProject.repository.Repository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmployeeService {

    @Autowired
    private Repository repository;

    public Employee addemployee(Employee employee) {
        return repository.save(employee);
    }


    public Employee findById(String employeeID) {
        return repository.findById(employeeID).get();
    }
}
