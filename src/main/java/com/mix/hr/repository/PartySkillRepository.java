package com.mix.hr.repository;

import com.mix.hr.entity.PartySkill;
import com.mix.hr.entity.PartySkillId;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PartySkillRepository extends JpaRepository<PartySkill, PartySkillId> {
    List<PartySkill> findByPartyId(String partyId);
}
