package com.example.demo.controller;

import com.example.demo.dto.ReassignmentRequest;
import com.example.demo.repository.entity.Employee;
import com.example.demo.service.EmployeeService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@Slf4j
@RequiredArgsConstructor
@RestController
@RequestMapping("/employee")
public class EmployeeController {

    private final EmployeeService employeeService;

    @PutMapping("/reassign")
    public ResponseEntity<Void> reassignEmployee(@RequestBody ReassignmentRequest request) {
        log.info("Reassigning employee = {}", request);
        employeeService.reassignEmployee(request);
        return ResponseEntity.ok().build();
    }
}
