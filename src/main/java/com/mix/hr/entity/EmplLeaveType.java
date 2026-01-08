package com.mix.hr.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class EmplLeaveType {
    @Id
    private String leaveTypeId;
    private String parentTypeId;
    private String hasTable;
    private String description;
}
