package com.example.demo.controller;

import com.example.demo.service.SalaryService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
@RequiredArgsConstructor
@RequestMapping("/pay-salary")
public class SalaryController {

    private final SalaryService salaryService;

    @PostMapping("/employee/{employeeId}")
    public ResponseEntity<Void> payEmployee(@PathVariable long employeeId) {
        log.info("Paying employee = {}", employeeId);
        salaryService.payEmployee(employeeId);
        return ResponseEntity.ok().build();
    }

    @PostMapping("/project/{projectId}")
    public ResponseEntity<Void> payEmployeesInProject(@PathVariable long projectId) {
        log.info("Paying employees in project = {}", projectId);
        salaryService.payEmployeesInProject(projectId);
        return ResponseEntity.ok().build();
    }

    @PostMapping("/")
    public ResponseEntity<Void> payAllEmployees() {
        log.info("Paying all employees");
        salaryService.payAllEmployee();
        return ResponseEntity.ok().build();
    }
}
