package com.demo.employee.model;

import lombok.Data;

@Data
public class EmployeeResponseDTO {
    private int id;
    private String name;
    private String email;
    private String age;
}
