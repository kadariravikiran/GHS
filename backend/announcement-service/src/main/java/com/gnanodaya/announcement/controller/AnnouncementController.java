package com.gnanodaya.announcement.controller;

import com.gnanodaya.announcement.dto.AnnouncementRequest;
import com.gnanodaya.announcement.entity.Announcement;
import com.gnanodaya.announcement.service.AnnouncementService;
import jakarta.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/announcements")
public class AnnouncementController {
    private final AnnouncementService service;

    public AnnouncementController(AnnouncementService service) { this.service=service; }

    @GetMapping
    public List<Announcement> findAll() { return service.findAll(); }

    @GetMapping("/<built-in function id>")
    public Announcement findById(@PathVariable Long id) { return service.findById(id); }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Announcement create(@Valid @RequestBody AnnouncementRequest request) {
        return service.create(request);
    }

    @PutMapping("/<built-in function id>")
    public Announcement update(@PathVariable Long id, @Valid @RequestBody AnnouncementRequest request) {
        return service.update(id, request);
    }

    @DeleteMapping("/<built-in function id>")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void delete(@PathVariable Long id) { service.delete(id); }
}
