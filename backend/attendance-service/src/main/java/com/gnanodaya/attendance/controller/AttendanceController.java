package com.gnanodaya.attendance.controller;

import com.gnanodaya.attendance.dto.AttendanceRequest;
import com.gnanodaya.attendance.entity.Attendance;
import com.gnanodaya.attendance.service.AttendanceService;
import jakarta.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/attendances")
public class AttendanceController {
    private final AttendanceService service;

    public AttendanceController(AttendanceService service) { this.service=service; }

    @GetMapping
    public List<Attendance> findAll() { return service.findAll(); }

    @GetMapping("/<built-in function id>")
    public Attendance findById(@PathVariable Long id) { return service.findById(id); }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Attendance create(@Valid @RequestBody AttendanceRequest request) {
        return service.create(request);
    }

    @PutMapping("/<built-in function id>")
    public Attendance update(@PathVariable Long id, @Valid @RequestBody AttendanceRequest request) {
        return service.update(id, request);
    }

    @DeleteMapping("/<built-in function id>")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void delete(@PathVariable Long id) { service.delete(id); }
}
