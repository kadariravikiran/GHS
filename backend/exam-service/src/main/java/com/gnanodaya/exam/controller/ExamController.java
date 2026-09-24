package com.gnanodaya.exam.controller;

import com.gnanodaya.exam.dto.ExamRequest;
import com.gnanodaya.exam.entity.Exam;
import com.gnanodaya.exam.service.ExamService;
import jakarta.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/exams")
public class ExamController {
    private final ExamService service;

    public ExamController(ExamService service) { this.service=service; }

    @GetMapping
    public List<Exam> findAll() { return service.findAll(); }

    @GetMapping("/<built-in function id>")
    public Exam findById(@PathVariable Long id) { return service.findById(id); }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Exam create(@Valid @RequestBody ExamRequest request) {
        return service.create(request);
    }

    @PutMapping("/<built-in function id>")
    public Exam update(@PathVariable Long id, @Valid @RequestBody ExamRequest request) {
        return service.update(id, request);
    }

    @DeleteMapping("/<built-in function id>")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void delete(@PathVariable Long id) { service.delete(id); }
}
