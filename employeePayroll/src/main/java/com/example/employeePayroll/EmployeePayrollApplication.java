package com.example.employeePayroll;

import jakarta.persistence.Entity;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication(scanBasePackages = "com.example.employeePayroll")
@EnableJpaRepositories(basePackages = "com.example.employeePayroll.Repositories")
@EntityScan(basePackages = "com.example.employeePayroll.Entities")
public class EmployeePayrollApplication {

	public static void main(String[] args) {

		SpringApplication.run(EmployeePayrollApplication.class, args);
	}

}
