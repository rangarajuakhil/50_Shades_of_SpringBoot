package com.akhil.cachingdemo.repository;

import com.akhil.cachingdemo.domain.Employees;
import org.springframework.stereotype.Repository;

@Repository
public class SimpleEmployeeRepository implements EmployeeRepository {
    @Override
    public Employees getByEmployeeId(Long employeeId) {

        simulateSlowService();
        return new Employees(employeeId,"Akhil",2l,200L);
    }

    private void simulateSlowService() {
        try {
            long time = 3000L;
            Thread.sleep(time);
        } catch (InterruptedException e) {
            throw new IllegalStateException(e);
        }
    }
}
