package com.example.recruit_pro.models.dtos;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

public class CandidateUpdateDTO {

    @NotBlank(message = "Address không được để trống")
    private String address;

    @Size(max = 200, message = "Bio độ dài tối đa 200 ký tự ")
    private String bio;

    public CandidateUpdateDTO() {
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getBio() {
        return bio;
    }

    public void setBio(String bio) {
        this.bio = bio;
    }
}