package com.mix.hr.dto;

import java.time.LocalDateTime;

public record PartyDto(
        String partyId,
        String partyTypeId,
        String statusId,
        LocalDateTime createdDate,
        LocalDateTime lastModifiedDate) {
}
