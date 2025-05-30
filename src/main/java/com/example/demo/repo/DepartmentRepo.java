package com.example.demo.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.demo.model.Department;

@Repository
public interface DepartmentRepo extends JpaRepository<Department, Integer> {
    
    @Query("SELECT name FROM Department")
    public List<String>getDeptNames();

    @Query("SELECT d From Department d WHERE d.name LIKE %?1%")
    public List<Department> searchName(String name);
}
