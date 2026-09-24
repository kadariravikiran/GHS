package com.gnanodaya.notification.controller;

import com.gnanodaya.notification.dto.NotificationRequest;
import com.gnanodaya.notification.entity.Notification;
import com.gnanodaya.notification.service.NotificationService;
import jakarta.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/notifications")
public class NotificationController {
    private final NotificationService service;

    public NotificationController(NotificationService service) { this.service=service; }

    @GetMapping
    public List<Notification> findAll() { return service.findAll(); }

    @GetMapping("/<built-in function id>")
    public Notification findById(@PathVariable Long id) { return service.findById(id); }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Notification create(@Valid @RequestBody NotificationRequest request) {
        return service.create(request);
    }

    @PutMapping("/<built-in function id>")
    public Notification update(@PathVariable Long id, @Valid @RequestBody NotificationRequest request) {
        return service.update(id, request);
    }

    @DeleteMapping("/<built-in function id>")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void delete(@PathVariable Long id) { service.delete(id); }
}
