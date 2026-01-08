package com.mix.hr.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;
import java.time.LocalDate;

@Entity
@Getter
@Setter
public class EmploymentBenefit {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private String benefitId; // Surrogate key

    private String partyIdFrom; // Organization (Provider/Employer)
    private String partyIdTo; // Employee
    private String roleTypeIdFrom;
    private String roleTypeIdTo;

    private String benefitTypeId;
    private LocalDate fromDate;
    private LocalDate thruDate;

    private BigDecimal cost;
    private Double actualEmployerPaidPercent;
    private Integer availableTime; // e.g., hours of PTO
}
