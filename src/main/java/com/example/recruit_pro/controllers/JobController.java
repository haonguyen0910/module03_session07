package com.example.recruit_pro.controllers;

import com.example.recruit_pro.models.dtos.JobCreateDTO;
import jakarta.validation.Valid;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/jobs")
public class JobController {

    @PostMapping
    public JobCreateDTO createJob(@Valid @RequestBody JobCreateDTO dto) {
        return dto;
    }
}