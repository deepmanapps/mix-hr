package com.mix.hr.mapper;

import com.mix.hr.dto.EmplLeaveDto;
import com.mix.hr.dto.PartySkillDto;
import com.mix.hr.entity.EmplLeave;
import com.mix.hr.entity.PartySkill;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper(componentModel = "spring")
public interface ResourceMapper {
    ResourceMapper INSTANCE = Mappers.getMapper(ResourceMapper.class);

    PartySkillDto toDto(PartySkill partySkill);

    PartySkill toEntity(PartySkillDto partySkillDto);

    EmplLeaveDto toDto(EmplLeave emplLeave);

    EmplLeave toEntity(EmplLeaveDto emplLeaveDto);
}
