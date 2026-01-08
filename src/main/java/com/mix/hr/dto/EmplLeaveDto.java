package com.mix.hr.dto;

import java.time.LocalDate;

public record EmplLeaveDto(
        String leaveId,
        String partyId,
        String leaveTypeId,
        String emplLeaveReasonTypeId,
        LocalDate fromDate,
        LocalDate thruDate,
        String approverPartyId,
        String leaveStatus,
        String description) {
}
