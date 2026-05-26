package com.example.recruit_pro.models.dtos;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

public class CompanyDTO {

    @NotBlank(message = "Company name không được để trống")
    private String name;

    @Size(min = 10, max = 13, message = "Tax code phải có từ 10 đến 13 ký tự")
    private String taxCode;

    public CompanyDTO() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTaxCode() {
        return taxCode;
    }

    public void setTaxCode(String taxCode) {
        this.taxCode = taxCode;
    }
}
