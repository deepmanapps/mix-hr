package com.mix.hr.dto;

public record EmplPositionClassTypeDto(
        String emplPositionClassTypeId,
        String parentTypeId,
        String hasTable,
        String description) {
}
