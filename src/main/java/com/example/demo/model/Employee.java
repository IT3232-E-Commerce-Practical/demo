package com.example.demo.model;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;

@Entity
public class Employee extends Person {
	@Id
	private String empNo;
	private double salary;
	@ManyToOne
	private Department department;
	@ManyToMany(mappedBy = "employees")
	private List<Project>projects;
	public String getEmpNo() {
		return empNo;
	}

	public Employee(String name, int age, String gender, String empNo, double salary, Department department,
	List<Project> projects) {
		super(name, age, gender);
		this.empNo = empNo;
		this.salary = salary;
		this.department = department;
		this.projects = projects;
	}


	public void setEmpNo(String empNo) {
		this.empNo = empNo;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public Department getDepartment() {
		return department;
	}
	public void setDepartment(Department department) {
		this.department = department;
	}
	public List<Project> getProjects() {
		return projects;
	}
	public void setProjects(List<Project> projects) {
		this.projects = projects;
	}
	
}
