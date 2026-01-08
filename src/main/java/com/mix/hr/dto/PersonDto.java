package com.mix.hr.dto;

import java.time.LocalDate;
import java.time.LocalDateTime;

public record PersonDto(
        String partyId, // Inherited ID
        String partyTypeId,
        String statusId,
        LocalDateTime createdDate,
        LocalDateTime lastModifiedDate,
        String salutation,
        String firstName,
        String middleName,
        String lastName,
        String personalTitle,
        String suffix,
        String nickname,
        String gender,
        LocalDate birthDate,
        String maritalStatus,
        String socialSecurityNumber) {
}
