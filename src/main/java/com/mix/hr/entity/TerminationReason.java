package com.mix.hr.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class TerminationReason {
    @Id
    private String terminationReasonId;
    private String description;
}
