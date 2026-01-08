package com.mix.hr.repository;

import com.mix.hr.entity.PersonTraining;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PersonTrainingRepository extends JpaRepository<PersonTraining, String> {
    List<PersonTraining> findByPartyId(String partyId);
}
