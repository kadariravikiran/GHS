package com.gnanodaya.notification.dto;

import jakarta.validation.constraints.NotBlank;

public class NotificationRequest {
    @NotBlank
    private String name;

    public String getName() { return name; }
    public void setName(String name) { this.name=name; }
}
