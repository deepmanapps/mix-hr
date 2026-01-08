package com.mix.hr.service;

import com.mix.hr.dto.TerminationReasonDto;
import com.mix.hr.dto.TerminationTypeDto;

import java.util.List;

public interface TerminationService {
    List<TerminationTypeDto> getAllTerminationTypes();

    List<TerminationReasonDto> getAllTerminationReasons();

    TerminationTypeDto createTerminationType(TerminationTypeDto typeDto);

    TerminationReasonDto createTerminationReason(TerminationReasonDto reasonDto);
}
