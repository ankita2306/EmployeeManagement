package com.demo.employee.controller;


import com.demo.employee.model.EmployeeResponseDTO;
import com.demo.employee.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/employee-service")
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;

    @GetMapping("/employees/{id}")
    private ResponseEntity<EmployeeResponseDTO> getEmployeeDetails(@PathVariable("id") int id) {
        EmployeeResponseDTO employee = employeeService.getEmployeeById(id);
        return ResponseEntity.status(HttpStatus.OK).body(employee);
    }

    @GetMapping("/getEmployees/{id}")
    public EmployeeResponseDTO getCountries(@PathVariable(value = "id") int id) {

        EmployeeResponseDTO employee = employeeService.getEmployeeById(id);
        //return country; //can return status code,datatype,headers,along with response entity class
        return employee;
    }

    @GetMapping("/test")
    private String testMethod() {
        return "test screen";
    }

  /*  @PostMapping("/employees")
    public ResponseEntity<EmployeeResponse> createEmployee(@RequestBody EmployeeResponse employeeResponse) {
        EmployeeResponse savedEmployee = employeeService.createEmployee(employeeResponse);
        return ResponseEntity.status(HttpStatus.CREATED).body(savedEmployee);
    }*/

}