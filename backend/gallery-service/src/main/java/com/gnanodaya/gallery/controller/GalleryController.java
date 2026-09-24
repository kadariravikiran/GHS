package com.gnanodaya.gallery.controller;

import com.gnanodaya.gallery.dto.GalleryRequest;
import com.gnanodaya.gallery.entity.Gallery;
import com.gnanodaya.gallery.service.GalleryService;
import jakarta.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/gallerys")
public class GalleryController {
    private final GalleryService service;

    public GalleryController(GalleryService service) { this.service=service; }

    @GetMapping
    public List<Gallery> findAll() { return service.findAll(); }

    @GetMapping("/<built-in function id>")
    public Gallery findById(@PathVariable Long id) { return service.findById(id); }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Gallery create(@Valid @RequestBody GalleryRequest request) {
        return service.create(request);
    }

    @PutMapping("/<built-in function id>")
    public Gallery update(@PathVariable Long id, @Valid @RequestBody GalleryRequest request) {
        return service.update(id, request);
    }

    @DeleteMapping("/<built-in function id>")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void delete(@PathVariable Long id) { service.delete(id); }
}
