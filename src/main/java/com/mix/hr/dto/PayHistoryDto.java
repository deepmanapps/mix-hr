package com.mix.hr.dto;

import java.math.BigDecimal;
import java.time.LocalDate;

public record PayHistoryDto(
        String payHistoryId,
        String emplPositionId,
        String partyId,
        LocalDate fromDate,
        LocalDate thruDate,
        BigDecimal amount,
        String comments) {
}
