package com.example.employeePayroll.Interfaces;

import com.example.employeePayroll.DTO.EmployeeDTO;
import com.example.employeePayroll.Entities.EmployeeEntity;
import org.springframework.stereotype.Service;


public interface IEmployeeService {

    public EmployeeDTO get(Long id) throws Exception;

    public EmployeeDTO create(EmployeeDTO newEmp) throws Exception;

    public EmployeeDTO edit(EmployeeDTO emp, Long id) throws Exception;

    public String delete(Long id);


}