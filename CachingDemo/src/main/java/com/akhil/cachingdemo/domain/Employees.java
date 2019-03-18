package com.akhil.cachingdemo.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.stereotype.Component;

@Setter
@Getter
@Component
@AllArgsConstructor
@NoArgsConstructor
public class Employees {

    private Long employeeId;
    private String employeeName;
    private Long department;
    private Long salary;


}
