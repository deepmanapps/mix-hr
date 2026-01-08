package com.mix.hr.repository;

import com.mix.hr.entity.EmplLeaveType;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmplLeaveTypeRepository extends JpaRepository<EmplLeaveType, String> {
}
