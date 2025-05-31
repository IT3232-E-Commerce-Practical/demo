package com.example.demo.model;

import java.util.Date;
import java.util.List;

public class ViewDepartment extends Department {
    private int empcount;

    public ViewDepartment() {
        
    }

    public ViewDepartment(int id, String name, java.sql.Date established, List<Employee> employees, int empcount) {
        super(id, name, established, employees);
        this.empcount = empcount;
    }

    public ViewDepartment(int empcount) {
        this.empcount = empcount;
    }
    
}
