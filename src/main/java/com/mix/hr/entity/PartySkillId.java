package com.mix.hr.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class PartySkillId implements Serializable {
    private String partyId;
    private String skillTypeId;
}
