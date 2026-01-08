package com.mix.hr.dto;

import java.time.LocalDateTime;

public record PersonTrainingDto(
        String personTrainingId,
        String partyId,
        String trainingClassTypeId,
        LocalDateTime fromDate,
        LocalDateTime thruDate,
        String approverPartyId,
        LocalDateTime approvDate,
        String reason,
        String workEffortId) {
}
