package com.mix.hr.dto;

import java.math.BigDecimal;
import java.time.LocalDate;

public record EmploymentBenefitDto(
        String benefitId,
        String partyIdFrom,
        String partyIdTo,
        String roleTypeIdFrom,
        String roleTypeIdTo,
        String benefitTypeId,
        LocalDate fromDate,
        LocalDate thruDate,
        BigDecimal cost,
        Double actualEmployerPaidPercent,
        Integer availableTime) {
}
