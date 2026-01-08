package com.mix.hr.mapper;

import com.mix.hr.dto.PartyDto;
import com.mix.hr.dto.PersonDto;
import com.mix.hr.entity.Party;
import com.mix.hr.entity.Person;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

@Mapper(componentModel = "spring")
public interface PartyMapper {
    PartyMapper INSTANCE = Mappers.getMapper(PartyMapper.class);

    PartyDto toDto(Party party);

    Party toEntity(PartyDto partyDto);

    PersonDto toDto(Person person);

    Person toEntity(PersonDto personDto);
}
