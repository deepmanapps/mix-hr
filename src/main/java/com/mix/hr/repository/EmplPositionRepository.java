package com.mix.hr.repository;

import com.mix.hr.entity.EmplPosition;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmplPositionRepository extends JpaRepository<EmplPosition, String> {
}
