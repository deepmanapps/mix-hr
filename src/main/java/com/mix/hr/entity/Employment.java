package com.mix.hr.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@Entity
@Getter
@Setter
public class Employment {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private String employmentId; // Added surrogate key for simpler JPA handling

    private String partyIdFrom; // Internal Organization
    private String partyIdTo; // Employee
    private String roleTypeIdFrom;
    private String roleTypeIdTo;

    private LocalDate fromDate;
    private LocalDate thruDate;
    private String terminationReasonId;
    private String terminationTypeId;
}
