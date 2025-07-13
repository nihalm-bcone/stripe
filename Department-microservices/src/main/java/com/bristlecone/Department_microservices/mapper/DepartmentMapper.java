package com.bristlecone.Department_microservices.mapper;

import com.bristlecone.Department_microservices.dto.DepartmentDto;
import com.bristlecone.Department_microservices.entity.Department;
import org.springframework.stereotype.Component;

@Component
public class DepartmentMapper {

    Department department;
    DepartmentDto departmentDto;

    public Department mapToDepartment(DepartmentDto departmentDto) {
        return new Department(departmentDto.getId(),
                department.getDepartmentName(),
                department.getDepartmentDescription(),
                departmentDto.getDepartmentCode());
    }

    public DepartmentDto mapToDepartmentDto(Department department) {

        return new DepartmentDto(
                department.getId(),
                department.getDepartmentName(),
                department.getDepartmentDescription(),
                department.getDepartmentCode()
        );
    }
}
