package com.mix.hr.dto;

import java.math.BigDecimal;
import java.time.LocalDate;

public record SalaryStepDto(
        String salaryStepSeqId,
        String payGradeId,
        LocalDate fromDate,
        LocalDate thruDate,
        BigDecimal amount,
        String payFrequency,
        String currencyUomId) {
}
