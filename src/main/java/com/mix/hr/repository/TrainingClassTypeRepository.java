package com.mix.hr.repository;

import com.mix.hr.entity.TrainingClassType;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TrainingClassTypeRepository extends JpaRepository<TrainingClassType, String> {
}
