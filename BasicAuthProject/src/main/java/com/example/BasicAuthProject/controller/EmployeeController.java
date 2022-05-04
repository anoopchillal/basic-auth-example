package com.example.BasicAuthProject.controller;

import com.example.BasicAuthProject.model.Employee;
import com.example.BasicAuthProject.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
@RequestMapping
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;

    @PostMapping("/employee")
    public ResponseEntity<Employee> userPost(@RequestBody @Valid Employee employee){
        return  new ResponseEntity<>(employeeService.addemployee(employee), HttpStatus.ACCEPTED);
    }

    @GetMapping("/employee/{employeeID}")
    public ResponseEntity<Employee> findById(@PathVariable("employeeID") String employeeID){
        return new ResponseEntity<>(employeeService.findById(employeeID), HttpStatus.ACCEPTED);
    }

//    @GetMapping("/userlogin")
//    public String userValidation()
//    {
//        return "User, Successfully logged in!";
//    }
//
//    @GetMapping("/adminlogin")
//    public String adminValidation()
//    {
//        return "Admin user, Successfully logged in!";
//    }
}
