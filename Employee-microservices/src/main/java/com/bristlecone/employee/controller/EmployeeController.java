package com.bristlecone.employee.controller;

import com.bristlecone.employee.dto.APIResponseDto;
import com.bristlecone.employee.dto.EmployeeDto;
import com.bristlecone.employee.service.EmployeeService;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@AllArgsConstructor
@NoArgsConstructor
@RestController
@RequestMapping("api/employees")
public class EmployeeController {
    
    private EmployeeService employeeService;

    @GetMapping("{id}")
    public ResponseEntity<APIResponseDto> getEmployeeById(@PathVariable("id") Long id) {

       APIResponseDto apiResponseDto = employeeService.getEmployeeById(id);

       return new ResponseEntity<>(apiResponseDto, HttpStatus.OK);
    }
}
