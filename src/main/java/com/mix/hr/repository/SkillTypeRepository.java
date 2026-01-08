package com.mix.hr.repository;

import com.mix.hr.entity.SkillType;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SkillTypeRepository extends JpaRepository<SkillType, String> {
}
