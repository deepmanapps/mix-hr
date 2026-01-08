package com.mix.hr.service.impl;

import com.mix.hr.dto.PartySkillDto;
import com.mix.hr.entity.PartySkill;
import com.mix.hr.entity.PartySkillId;
import com.mix.hr.mapper.ResourceMapper;
import com.mix.hr.repository.PartySkillRepository;
import com.mix.hr.service.SkillService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.stream.Collectors;

@Service
@Transactional
@RequiredArgsConstructor
public class SkillServiceImpl implements SkillService {

    private final PartySkillRepository partySkillRepository;
    private final ResourceMapper resourceMapper;

    @Override
    public PartySkillDto addSkillToParty(PartySkillDto partySkillDto) {
        PartySkill partySkill = resourceMapper.toEntity(partySkillDto);
        return resourceMapper.toDto(partySkillRepository.save(partySkill));
    }

    @Override
    @Transactional(readOnly = true)
    public List<PartySkillDto> getSkillsByParty(String partyId) {
        return partySkillRepository.findByPartyId(partyId).stream()
                .map(resourceMapper::toDto)
                .collect(Collectors.toList());
    }

    @Override
    public void removeSkillFromParty(String partyId, String skillTypeId) {
        partySkillRepository.deleteById(new PartySkillId(partyId, skillTypeId));
    }
}
