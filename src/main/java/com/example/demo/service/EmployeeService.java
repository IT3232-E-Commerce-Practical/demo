package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.example.demo.model.Employee;
import com.example.demo.repo.EmployeeRepo;

import jakarta.persistence.EntityNotFoundException;

public class EmployeeService {

    @Autowired
    private EmployeeRepo repo;

    
	public List<Employee> searchEmployeesBySalaryRange(){
		if (repo.searchEmployees().isEmpty()) {
			throw new EntityNotFoundException("Employee Not Found");
		}
		return repo.searchEmployees();
	}
}
