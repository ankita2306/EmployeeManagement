package com.demo.employee.service;

import com.demo.employee.entity.Employee;
import com.demo.employee.model.EmployeeResponseDTO;
import com.demo.employee.repository.EmployeeRepository;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.Optional;

@Service
public class EmployeeService {
    @Autowired
    private EmployeeRepository employeeRepository;

    @Autowired
    private ModelMapper mapper;


    public EmployeeResponseDTO getEmployeeById(int id) {
        Optional<Employee> employee = employeeRepository.findById(id);
        EmployeeResponseDTO employeeResponse = mapper.map(employee, EmployeeResponseDTO.class);
        return employeeResponse;
    }


    public Employee getCountryById(int id)  //returns all details of the country based on ID
    {
        return employeeRepository.findById(id).get();
    }
}
