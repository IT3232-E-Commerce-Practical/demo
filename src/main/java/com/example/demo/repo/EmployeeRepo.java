package com.example.demo.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.demo.model.Employee;

@Repository
public interface EmployeeRepo extends JpaRepository<Employee,String>{

        @Query("SELECT e FROM Employee e WHERE e.salary >= 70000 AND e.salary <=90000")
        public List<Employee> searchEmployees();
    
}


