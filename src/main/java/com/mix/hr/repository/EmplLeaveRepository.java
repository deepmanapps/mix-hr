package com.mix.hr.repository;

import com.mix.hr.entity.EmplLeave;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EmplLeaveRepository extends JpaRepository<EmplLeave, String> {
    List<EmplLeave> findByPartyId(String partyId);
}
