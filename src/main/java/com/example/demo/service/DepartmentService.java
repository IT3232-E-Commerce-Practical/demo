package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Department;
import com.example.demo.repo.DepartmentRepo;

import jakarta.persistence.EntityNotFoundException;

@Service
public class DepartmentService {
    @Autowired
    private DepartmentRepo repo;

    public List<Department> getDepts(){
        return repo.findAll();
    }

    public Department getDepts(int id){
        if(repo.findAllById(id).isEmpty()){
            throw new EntityNotFoundException("Department not found");
        }
        return repo.findById(null)
    }
}
