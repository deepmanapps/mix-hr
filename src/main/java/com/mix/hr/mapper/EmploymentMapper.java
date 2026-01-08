package com.mix.hr.mapper;

import com.mix.hr.dto.EmplPositionDto;
import com.mix.hr.dto.EmploymentDto;
import com.mix.hr.entity.EmplPosition;
import com.mix.hr.entity.Employment;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper(componentModel = "spring")
public interface EmploymentMapper {
    EmploymentMapper INSTANCE = Mappers.getMapper(EmploymentMapper.class);

    EmploymentDto toDto(Employment employment);

    Employment toEntity(EmploymentDto employmentDto);

    EmplPositionDto toDto(EmplPosition emplPosition);

    EmplPosition toEntity(EmplPositionDto emplPositionDto);
}
