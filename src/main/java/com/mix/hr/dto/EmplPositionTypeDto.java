package com.mix.hr.dto;

public record EmplPositionTypeDto(
        String emplPositionTypeId,
        String parentTypeId,
        String hasTable,
        String description) {
}
