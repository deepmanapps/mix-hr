package com.mix.hr.dto;

public record EmplLeaveTypeDto(
        String leaveTypeId,
        String parentTypeId,
        String hasTable,
        String description) {
}
