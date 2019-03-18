package com.akhil.cachingdemo.controller;

import com.akhil.cachingdemo.domain.Employees;
import com.akhil.cachingdemo.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;

    @GetMapping("/employees/{id}")
    public Employees getEmployee(@PathVariable Long id){
        System.out.printf("Searching by ID: "+id);
        return employeeService.getEmployeById(id);
    }
}
