package com.mix.hr.repository;

import com.mix.hr.entity.Party;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PartyRepository extends JpaRepository<Party, String> {
}
