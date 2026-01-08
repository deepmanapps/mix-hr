package com.mix.hr.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@Entity
@Getter
@Setter
public class EmplLeave {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private String leaveId; // Surrogate key

    private String partyId;
    private String leaveTypeId;
    private String emplLeaveReasonTypeId;
    private LocalDate fromDate;
    private LocalDate thruDate;
    private String approverPartyId;
    private String leaveStatus;
    private String description;
}
