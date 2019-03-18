package com.akhil.cachingdemo.service;


import com.akhil.cachingdemo.domain.Employees;
import com.akhil.cachingdemo.repository.SimpleEmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmployeeService {

    @Autowired
    private SimpleEmployeeRepository simpleEmployeeRepository;

    public Employees getEmployeById(Long id){
        return simpleEmployeeRepository.getByEmployeeId(id);
    }
}
