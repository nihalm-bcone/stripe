package com.bristlecone.employee.service;

import com.bristlecone.employee.dto.APIResponseDto;
import com.bristlecone.employee.dto.EmployeeDto;

public interface EmployeeService {

    public APIResponseDto getEmployeeById(Long id);
}
