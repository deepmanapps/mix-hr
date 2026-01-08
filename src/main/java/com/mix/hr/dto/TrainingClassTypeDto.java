package com.mix.hr.dto;

public record TrainingClassTypeDto(
        String trainingClassTypeId,
        String parentTypeId,
        String hasTable,
        String description) {
}
