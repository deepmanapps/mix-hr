package com.mix.hr.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@Entity
@Getter
@Setter
public class PerfReview {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private String perfReviewId;

    private String employeePartyId;
    private String employeeRoleTypeId;
    private String managerPartyId;
    private String managerRoleTypeId;
    private String paymentId;
    private String emplPositionId;
    private LocalDate fromDate;
    private LocalDate thruDate;
    private String comments;
}
