package com.bristlecone.Department_microservices.service;

import com.bristlecone.Department_microservices.dto.DepartmentDto;
import com.bristlecone.Department_microservices.entity.Department;
import com.bristlecone.Department_microservices.mapper.DepartmentMapper;
import com.bristlecone.Department_microservices.repository.DepartmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DepartmentServiceImpl implements DepartmentService {

    @Autowired
    private DepartmentRepository departmentRepository;

    @Autowired
    private DepartmentMapper departmentMapper;

    @Override
    public DepartmentDto saveDepartment(DepartmentDto departmentDto) {

        Department saveDepartment = departmentMapper.mapToDepartment(departmentDto);
        Department savedDepartment = departmentRepository.save(saveDepartment);
        return departmentMapper.mapToDepartmentDto(savedDepartment);

    }

    @Override
    public DepartmentDto getDepartmentByCode(String departmentCode) {

        Department department = departmentRepository.findByDepartmentCode(departmentCode);
        return departmentMapper.mapToDepartmentDto(department);

    }
}
