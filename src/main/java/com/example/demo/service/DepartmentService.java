package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DuplicateKeyException;
import org.springframework.stereotype.Service;

import jakarta.persistence.EntityNotFoundException;
import com.example.demo.model.Department;
import com.example.demo.repo.DepartmentRepo;

@Service
public class DepartmentService {
	@Autowired
	private DepartmentRepo repo;
	
	public List<Department> getDepts(){
		return repo.findAll();
	}
	public Department getDept( int id) {
		if(repo.findById(id).isEmpty()) {
			throw new EntityNotFoundException("Department Not Found");
		}
		return repo.findById(id).get();
	}

	public String addDept(Department department){
		if (repo.findById(department.getId()).isPresent()){
			throw new DuplicateKeyException("The department is alredy available");
		}
		repo.save(department);
		return "New department added";
	}

	public List<String>getDepartmentNames(){
		if (repo.getDeptNames().isEmpty()) {
			throw new EntityNotFoundException("Department Not Found");
		}
		return repo.getDeptNames();
	}

	
	public List<Department> searchDepartmentByName(String name){
		if (repo.searchName(name).isEmpty()) {
			throw new EntityNotFoundException("Department Not Found");
		}
		return repo.searchName(name);
	}
}
