package com.mix.hr.dto;

import java.time.LocalDateTime;

public record PartySkillDto(
        String partyId,
        String skillTypeId,
        Long yearsExperience,
        Long rating,
        Long skillLevel,
        LocalDateTime startedUsingDate) {
}
