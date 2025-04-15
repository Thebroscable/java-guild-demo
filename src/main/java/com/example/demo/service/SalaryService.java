package com.example.demo.service;

import com.example.demo.repository.EmployeeRepository;
import com.example.demo.repository.ProjectRepository;
import com.example.demo.repository.entity.Employee;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;

@Slf4j
@Service
@RequiredArgsConstructor
public class SalaryService {

    private final EmployeeRepository employeeRepository;
    private final ProjectRepository projectRepository;

    private void payEmployee(Employee employee) {
        BigDecimal salary = BigDecimal.valueOf(employee.getSalary());
        BigDecimal taxValue = salary.multiply(employee.getContractType().getTaxRate());
        log.info("Paying employee = {}, salary = {}", employee.getName(), salary.add(taxValue));
    }

    public void payEmployee(Long employeeId) {
        employeeRepository
                .findById(employeeId)
                .ifPresent(this::payEmployee);
    }

    public void payEmployeesInProject(Long projectId) {
        projectRepository
                .findById(projectId)
                .ifPresent(project -> project.getEmployees().forEach(this::payEmployee));
    }

    public void payAllEmployee() {
        employeeRepository
                .findAll()
                .forEach(this::payEmployee);
    }
}
