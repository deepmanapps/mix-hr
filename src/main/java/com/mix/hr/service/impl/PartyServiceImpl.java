package com.mix.hr.service.impl;

import com.mix.hr.dto.PartyDto;
import com.mix.hr.dto.PersonDto;
import com.mix.hr.entity.Party;
import com.mix.hr.entity.Person;
import com.mix.hr.mapper.PartyMapper;
import com.mix.hr.repository.PartyRepository;
import com.mix.hr.repository.PersonRepository;
import com.mix.hr.service.PartyService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
@Transactional
@RequiredArgsConstructor
public class PartyServiceImpl implements PartyService {

    private final PartyRepository partyRepository;
    private final PersonRepository personRepository;
    private final PartyMapper partyMapper;

    @Override
    public PartyDto createParty(PartyDto partyDto) {
        Party party = partyMapper.toEntity(partyDto);
        return partyMapper.toDto(partyRepository.save(party));
    }

    @Override
    public PersonDto createPerson(PersonDto personDto) {
        Person person = partyMapper.toEntity(personDto);
        return partyMapper.toDto(personRepository.save(person));
    }

    @Override
    @Transactional(readOnly = true)
    public Optional<PartyDto> getParty(String partyId) {
        return partyRepository.findById(partyId).map(partyMapper::toDto);
    }

    @Override
    @Transactional(readOnly = true)
    public Optional<PersonDto> getPerson(String partyId) {
        return personRepository.findById(partyId).map(partyMapper::toDto);
    }

    @Override
    @Transactional(readOnly = true)
    public List<PersonDto> getAllPersons() {
        return personRepository.findAll().stream()
                .map(partyMapper::toDto)
                .collect(Collectors.toList());
    }

    @Override
    public void deleteParty(String partyId) {
        partyRepository.deleteById(partyId);
    }
}
