package com.mix.hr.repository;

import com.mix.hr.entity.EmplPositionClassType;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmplPositionClassTypeRepository extends JpaRepository<EmplPositionClassType, String> {
}
