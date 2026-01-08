package com.mix.hr.dto;

public record SkillTypeDto(
        String skillTypeId,
        String parentTypeId,
        String hasTable,
        String description) {
}
