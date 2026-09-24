package com.gnanodaya.fee.dto;

import jakarta.validation.constraints.NotBlank;

public class FeeRequest {
    @NotBlank
    private String name;

    public String getName() { return name; }
    public void setName(String name) { this.name=name; }
}
