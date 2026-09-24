package com.gnanodaya.attendance.dto;

import jakarta.validation.constraints.NotBlank;

public class AttendanceRequest {
    @NotBlank
    private String name;

    public String getName() { return name; }
    public void setName(String name) { this.name=name; }
}
