package com.mix.hr.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@Entity
@Getter
@Setter
public class EmplPosition {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private String emplPositionId;

    private String statusId;
    private String partyId; // Organization
    private String budgetId;
    private String budgetItemSeqId;
    private String emplPositionTypeId;

    private LocalDate estimatedFromDate;
    private LocalDate estimatedThruDate;

    private String salaryFlag; // Y/N
    private String exemptFlag; // Y/N
    private String fulltimeFlag; // Y/N
    private String temporaryFlag; // Y/N

    private LocalDate actualFromDate;
    private LocalDate actualThruDate;
}
