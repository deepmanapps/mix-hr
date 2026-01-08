package com.mix.hr.repository;

import com.mix.hr.entity.EmplPositionType;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmplPositionTypeRepository extends JpaRepository<EmplPositionType, String> {
}
