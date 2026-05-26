package com.example.recruit_pro.repositories;

import com.example.recruit_pro.models.entities.Candidate;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CandidateRepository extends JpaRepository<Candidate, Integer> {
}
