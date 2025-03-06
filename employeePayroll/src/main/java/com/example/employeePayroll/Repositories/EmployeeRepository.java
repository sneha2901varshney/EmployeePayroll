package com.example.employeePayroll.Repositories;
import com.example.employeePayroll.Entities.EmployeeEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<EmployeeEntity, Long> {


}