package com.mix.hr.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class EmplPositionType {
    @Id
    private String emplPositionTypeId;
    private String parentTypeId;
    private String hasTable; // Y/N
    private String description;
}
