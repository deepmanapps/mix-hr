package com.mix.hr.repository;

import com.mix.hr.entity.PayHistory;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PayHistoryRepository extends JpaRepository<PayHistory, String> {
    List<PayHistory> findByPartyId(String partyId);
}
