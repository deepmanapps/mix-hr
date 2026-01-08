package com.mix.hr.service;

import com.mix.hr.dto.PartySkillDto;
import com.mix.hr.entity.PartySkillId;

import java.util.List;

public interface SkillService {
    PartySkillDto addSkillToParty(PartySkillDto partySkillDto);

    List<PartySkillDto> getSkillsByParty(String partyId);

    void removeSkillFromParty(String partyId, String skillTypeId);
}
