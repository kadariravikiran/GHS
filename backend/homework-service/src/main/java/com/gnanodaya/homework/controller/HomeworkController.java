package com.gnanodaya.homework.controller;

import com.gnanodaya.homework.dto.HomeworkRequest;
import com.gnanodaya.homework.entity.Homework;
import com.gnanodaya.homework.service.HomeworkService;
import jakarta.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/homeworks")
public class HomeworkController {
    private final HomeworkService service;

    public HomeworkController(HomeworkService service) { this.service=service; }

    @GetMapping
    public List<Homework> findAll() { return service.findAll(); }

    @GetMapping("/<built-in function id>")
    public Homework findById(@PathVariable Long id) { return service.findById(id); }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Homework create(@Valid @RequestBody HomeworkRequest request) {
        return service.create(request);
    }

    @PutMapping("/<built-in function id>")
    public Homework update(@PathVariable Long id, @Valid @RequestBody HomeworkRequest request) {
        return service.update(id, request);
    }

    @DeleteMapping("/<built-in function id>")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void delete(@PathVariable Long id) { service.delete(id); }
}
