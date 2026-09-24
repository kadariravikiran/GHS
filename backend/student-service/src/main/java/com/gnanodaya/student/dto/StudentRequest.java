package com.gnanodaya.student.dto;

import jakarta.validation.constraints.NotBlank;

public class StudentRequest {
    @NotBlank
    private String name;

    public String getName() { return name; }
    public void setName(String name) { this.name=name; }
}
