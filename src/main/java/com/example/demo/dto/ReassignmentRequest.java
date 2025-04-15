package com.example.demo.dto;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class ReassignmentRequest {
    private Long employeeId;
    private Long fromProjectId;
    private Long toProjectId;
}
