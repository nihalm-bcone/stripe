package com.bristlecone.employee.service;

import com.bristlecone.employee.dto.APIResponseDto;
import com.bristlecone.employee.dto.DepartmentDto;
import com.bristlecone.employee.dto.EmployeeDto;
import com.bristlecone.employee.entity.Employee;
import com.bristlecone.employee.mapper.EmployeeMapper;
import com.bristlecone.employee.repository.EmplopyeeRepository;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@AllArgsConstructor
@NoArgsConstructor
@Service
public class EmployeeServiceImpl implements EmployeeService {

    private EmplopyeeRepository emplopeeeRepository;

    private EmployeeMapper employeeMapper;

    private RestTemplate restTemplate;

    @Override
    public APIResponseDto getEmployeeById(Long id) {

        Employee employee = emplopeeeRepository.findById(id).get();
        DepartmentDto departmentDto = restTemplate.getForEntity("http://localhost:8080/api/departments/" + employee.getDepartmentCode() ,
                DepartmentDto.class).getBody();
        EmployeeDto employeeDto = employeeMapper.mapToEmployeeDto(employee);
        APIResponseDto apiResponseDto = new APIResponseDto();
        apiResponseDto.setDepartmentDto(departmentDto);
        apiResponseDto.setEmployeeDto(employeeDto);
        return apiResponseDto;
    }
}
