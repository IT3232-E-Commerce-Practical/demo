package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import com.example.demo.model.Employee;
import com.example.demo.service.EmployeeService;



@RestController
@RequestMapping("/employee")
public class EmployeeController {

    @Autowired
    public EmployeeService service;

    @GetMapping("/search")
	public ResponseEntity<List<Employee>>searchEmployees(){
		return new ResponseEntity<List<Employee>>(service.searchEmployeesBySalaryRange(),HttpStatus.OK);
	}
}
