package com.mix.hr.repository;

import com.mix.hr.entity.PerfReview;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PerfReviewRepository extends JpaRepository<PerfReview, String> {
    List<PerfReview> findByEmployeePartyId(String employeePartyId);

    List<PerfReview> findByManagerPartyId(String managerPartyId);
}
