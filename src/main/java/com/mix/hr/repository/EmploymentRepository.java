package com.mix.hr.repository;

import com.mix.hr.entity.Employment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EmploymentRepository extends JpaRepository<Employment, String> {
    List<Employment> findByPartyIdTo(String partyIdTo);

    List<Employment> findByPartyIdFrom(String partyIdFrom);
}
