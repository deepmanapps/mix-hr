package com.mix.hr.dto;

import java.time.LocalDate;

public record PerfReviewDto(
        String perfReviewId,
        String employeePartyId,
        String employeeRoleTypeId,
        String managerPartyId,
        String managerRoleTypeId,
        String paymentId,
        String emplPositionId,
        LocalDate fromDate,
        LocalDate thruDate,
        String comments) {
}
