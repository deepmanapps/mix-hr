package com.mix.hr.repository;

import com.mix.hr.entity.TerminationReason;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TerminationReasonRepository extends JpaRepository<TerminationReason, String> {
}
