package com.gnanodaya.teacher.dto;

import jakarta.validation.constraints.NotBlank;

public class TeacherRequest {
    @NotBlank
    private String name;

    public String getName() { return name; }
    public void setName(String name) { this.name=name; }
}
