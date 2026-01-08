package com.mix.hr.dto;

public record TerminationTypeDto(
        String terminationTypeId,
        String parentTypeId,
        String hasTable,
        String description) {
}
