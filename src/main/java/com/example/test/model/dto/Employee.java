package com.example.test.model.dto;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.Value;

@Value
public class Employee {
    Integer employeeId;
    String employeeName;
    Integer employeeAge;
}
