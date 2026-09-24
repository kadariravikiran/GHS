package com.gnanodaya.gallery.dto;

import jakarta.validation.constraints.NotBlank;

public class GalleryRequest {
    @NotBlank
    private String name;

    public String getName() { return name; }
    public void setName(String name) { this.name=name; }
}
