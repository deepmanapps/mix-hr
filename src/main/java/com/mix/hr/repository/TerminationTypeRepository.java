package com.mix.hr.repository;

import com.mix.hr.entity.TerminationType;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TerminationTypeRepository extends JpaRepository<TerminationType, String> {
}
