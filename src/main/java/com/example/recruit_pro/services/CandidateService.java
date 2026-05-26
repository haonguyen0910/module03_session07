package com.example.recruit_pro.services;

import com.example.recruit_pro.models.dtos.CandidateCreateDTO;
import com.example.recruit_pro.models.dtos.CandidateUpdateDTO;
import com.example.recruit_pro.models.entities.Candidate;
import com.example.recruit_pro.repositories.CandidateRepository;
import org.springframework.stereotype.Service;

@Service
public class CandidateService {

    private final CandidateRepository candidateRepository;

    public CandidateService(CandidateRepository candidateRepository) {
        this.candidateRepository = candidateRepository;
    }

    public Candidate create(CandidateCreateDTO dto) {

        Candidate candidate = new Candidate();

        candidate.setFullName(dto.getFullName());
        candidate.setEmail(dto.getEmail());
        candidate.setAge(dto.getAge());
        candidate.setYearsOfExperience(dto.getYearsOfExperience());
        candidate.setPhoneNumber(dto.getPhoneNumber());

        return candidateRepository.save(candidate);
    }

    public Candidate update(Integer id, CandidateUpdateDTO dto) {

        Candidate candidate = candidateRepository.findById(id).orElseThrow(() -> new RuntimeException("Candidate not found"));

        candidate.setAddress(dto.getAddress());
        candidate.setBio(dto.getBio());

        return candidateRepository.save(candidate);
    }
}
