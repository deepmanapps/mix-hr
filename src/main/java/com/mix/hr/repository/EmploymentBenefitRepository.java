package com.mix.hr.repository;

import com.mix.hr.entity.EmploymentBenefit;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EmploymentBenefitRepository extends JpaRepository<EmploymentBenefit, String> {
    List<EmploymentBenefit> findByPartyIdTo(String partyIdTo);
}
