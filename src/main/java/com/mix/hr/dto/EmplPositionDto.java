package com.mix.hr.dto;

import java.time.LocalDate;

public record EmplPositionDto(
        String emplPositionId,
        String statusId,
        String partyId,
        String budgetId,
        String budgetItemSeqId,
        String emplPositionTypeId,
        LocalDate estimatedFromDate,
        LocalDate estimatedThruDate,
        String salaryFlag,
        String exemptFlag,
        String fulltimeFlag,
        String temporaryFlag,
        LocalDate actualFromDate,
        LocalDate actualThruDate) {
}
