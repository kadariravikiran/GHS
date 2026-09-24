package com.gnanodaya.teacher.controller;

import com.gnanodaya.teacher.dto.TeacherRequest;
import com.gnanodaya.teacher.entity.Teacher;
import com.gnanodaya.teacher.service.TeacherService;
import jakarta.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/teachers")
public class TeacherController {
    private final TeacherService service;

    public TeacherController(TeacherService service) { this.service=service; }

    @GetMapping
    public List<Teacher> findAll() { return service.findAll(); }

    @GetMapping("/<built-in function id>")
    public Teacher findById(@PathVariable Long id) { return service.findById(id); }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Teacher create(@Valid @RequestBody TeacherRequest request) {
        return service.create(request);
    }

    @PutMapping("/<built-in function id>")
    public Teacher update(@PathVariable Long id, @Valid @RequestBody TeacherRequest request) {
        return service.update(id, request);
    }

    @DeleteMapping("/<built-in function id>")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void delete(@PathVariable Long id) { service.delete(id); }
}
