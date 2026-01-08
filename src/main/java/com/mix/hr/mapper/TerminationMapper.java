package com.mix.hr.mapper;

import com.mix.hr.dto.TerminationReasonDto;
import com.mix.hr.dto.TerminationTypeDto;
import com.mix.hr.entity.TerminationReason;
import com.mix.hr.entity.TerminationType;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper(componentModel = "spring")
public interface TerminationMapper {
    TerminationMapper INSTANCE = Mappers.getMapper(TerminationMapper.class);

    TerminationTypeDto toDto(TerminationType terminationType);

    TerminationType toEntity(TerminationTypeDto terminationTypeDto);

    TerminationReasonDto toDto(TerminationReason terminationReason);

    TerminationReason toEntity(TerminationReasonDto terminationReasonDto);
}
