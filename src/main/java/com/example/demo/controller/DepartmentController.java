package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Department;
import com.example.demo.repo.DepartmentRepo;
import com.example.demo.service.DepartmentService;
import org.springframework.web.bind.annotation.RequestParam;


@RestController
@RequestMapping("/dept")
public class DepartmentController {
    @Autowired
    private DepartmentService service;

    @GetMapping
    
    public ResponseEntity<List<Department>>getDepts(){
        return new ResponseEntity<Department>(service.getDepts(),HttpStatus.OK);
    }
    

}
