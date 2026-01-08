package com.mix.hr.dto;

import java.time.LocalDate;

public record EmploymentDto(
        String employmentId,
        String partyIdFrom,
        String partyIdTo,
        String roleTypeIdFrom,
        String roleTypeIdTo,
        LocalDate fromDate,
        LocalDate thruDate,
        String terminationReasonId,
        String terminationTypeId) {
}
