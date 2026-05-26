package com.example.recruit_pro.models.dtos;

import jakarta.validation.Valid;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

public class JobCreateDTO {

    @NotBlank(message = "Title không được để trống")
    private String title;

    @Valid
    @NotNull(message = "Company không được để trống")
    private CompanyDTO company;

    public JobCreateDTO() {
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public CompanyDTO getCompany() {
        return company;
    }

    public void setCompany(CompanyDTO company) {
        this.company = company;
    }
}
