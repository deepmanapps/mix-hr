package com.mix.hr.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Entity
@Getter
@Setter
public class PersonTraining {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private String personTrainingId; // Surrogate key

    private String partyId;
    private String trainingClassTypeId;
    private LocalDateTime fromDate;
    private LocalDateTime thruDate;
    private String approverPartyId;
    private LocalDateTime approvDate;
    private String reason;
    private String workEffortId;
}
