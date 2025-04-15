package com.example.demo.enums;

import lombok.Getter;

import java.math.BigDecimal;

@Getter
public enum ContractType {
    B2B(new BigDecimal("0.23")),
    CONTRACT(BigDecimal.ZERO);

    private final BigDecimal taxRate;

    ContractType(BigDecimal taxRate) {
        this.taxRate = taxRate;
    }
}
