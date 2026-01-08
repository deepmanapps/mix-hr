package com.mix.hr.service;

import com.mix.hr.dto.PartyDto;
import com.mix.hr.dto.PersonDto;

import java.util.List;
import java.util.Optional;

public interface PartyService {
    PartyDto createParty(PartyDto partyDto);

    PersonDto createPerson(PersonDto personDto);

    Optional<PartyDto> getParty(String partyId);

    Optional<PersonDto> getPerson(String partyId);

    List<PersonDto> getAllPersons();

    void deleteParty(String partyId);
}
