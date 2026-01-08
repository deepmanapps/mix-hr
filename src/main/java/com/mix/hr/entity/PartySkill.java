package com.mix.hr.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Entity
@Getter
@Setter
@IdClass(PartySkillId.class)
public class PartySkill {
    @Id
    private String partyId;
    @Id
    private String skillTypeId;

    private Long yearsExperience;
    private Long rating;
    private Long skillLevel;
    private LocalDateTime startedUsingDate;
}
