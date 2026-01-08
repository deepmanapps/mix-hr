package com.mix.hr.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;
import java.time.LocalDate;

@Entity
@Getter
@Setter
public class SalaryStep {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private String salaryStepSeqId;

    private String payGradeId;
    private LocalDate fromDate;
    private LocalDate thruDate;
    private BigDecimal amount;
    private String payFrequency; // MONTHLY, HOURLY, etc.
    private String currencyUomId;
}
