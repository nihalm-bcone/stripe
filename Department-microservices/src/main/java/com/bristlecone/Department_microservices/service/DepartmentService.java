package com.bristlecone.Department_microservices.service;

import com.bristlecone.Department_microservices.dto.DepartmentDto;

public interface DepartmentService {

    DepartmentDto saveDepartment(DepartmentDto departmentDto);

    DepartmentDto getDepartmentByCode(String departmentCode);
}
