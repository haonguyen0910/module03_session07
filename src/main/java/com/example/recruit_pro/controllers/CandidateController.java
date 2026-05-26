package com.example.recruit_pro.controllers;

import com.example.recruit_pro.models.dtos.CandidateCreateDTO;
import com.example.recruit_pro.models.entities.Candidate;
import com.example.recruit_pro.services.CandidateService;
import jakarta.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/candidates")
public class CandidateController {

    private final CandidateService candidateService;

    public CandidateController(CandidateService candidateService) {
        this.candidateService = candidateService;
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Candidate create(@Valid @RequestBody CandidateCreateDTO dto) {
        return candidateService.create(dto);
    }
}
