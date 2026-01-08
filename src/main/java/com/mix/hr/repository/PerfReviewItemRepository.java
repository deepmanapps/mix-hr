package com.mix.hr.repository;

import com.mix.hr.entity.PerfReviewItem;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PerfReviewItemRepository extends JpaRepository<PerfReviewItem, String> {
    List<PerfReviewItem> findByPerfReviewId(String perfReviewId);
}
