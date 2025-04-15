package com.example.demo.service;

import com.example.demo.dto.ReassignmentRequest;
import com.example.demo.exception.EmployeeNotFoundException;
import com.example.demo.exception.ProjectNotFoundException;
import com.example.demo.repository.EmployeeRepository;
import com.example.demo.repository.ProjectRepository;
import com.example.demo.repository.entity.Employee;
import com.example.demo.repository.entity.Project;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Slf4j
@Service
@RequiredArgsConstructor
public class EmployeeService {

    private final EmployeeRepository employeeRepository;
    private final ProjectRepository projectRepository;

    public void reassignEmployee(ReassignmentRequest request) {
        Employee employee = employeeRepository.findById(request.getEmployeeId())
                .orElseThrow(() -> new EmployeeNotFoundException("Not Found"));
        Project fromProject = projectRepository.findById(request.getFromProjectId())
                .orElseThrow(() -> new ProjectNotFoundException("Not Found"));
        Project toProject = projectRepository.findById(request.getToProjectId())
                .orElseThrow(() -> new ProjectNotFoundException("Not Found"));

        employee.getProjects().remove(fromProject);
        employee.getProjects().add(toProject);
        employeeRepository.save(employee);
        log.info("Employee projects = {}", employee.getProjects());
    }
}
