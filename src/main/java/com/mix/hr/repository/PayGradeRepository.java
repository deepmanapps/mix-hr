package com.mix.hr.repository;

import com.mix.hr.entity.PayGrade;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PayGradeRepository extends JpaRepository<PayGrade, String> {
}
