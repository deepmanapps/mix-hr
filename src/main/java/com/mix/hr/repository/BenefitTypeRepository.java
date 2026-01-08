package com.mix.hr.repository;

import com.mix.hr.entity.BenefitType;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BenefitTypeRepository extends JpaRepository<BenefitType, String> {
}
