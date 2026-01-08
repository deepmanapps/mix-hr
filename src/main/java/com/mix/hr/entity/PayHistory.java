package com.mix.hr.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;
import java.time.LocalDate;

@Entity
@Getter
@Setter
public class PayHistory {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private String payHistoryId; // Surrogate key

    private String emplPositionId;
    private String partyId;
    private LocalDate fromDate;
    private LocalDate thruDate;
    private BigDecimal amount;
    private String comments;
}
