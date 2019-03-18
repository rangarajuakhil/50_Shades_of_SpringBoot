package com.akhil.cachingdemo.repository;

import com.akhil.cachingdemo.domain.Employees;

public interface EmployeeRepository {
   Employees getByEmployeeId(Long employeeId);

}
