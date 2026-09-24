package com.gnanodaya.student.controller;

import com.gnanodaya.student.dto.StudentRequest;
import com.gnanodaya.student.entity.Student;
import com.gnanodaya.student.service.StudentService;
import jakarta.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/students")
public class StudentController {
    private final StudentService service;

    public StudentController(StudentService service) { this.service=service; }

    @GetMapping
    public List<Student> findAll() { return service.findAll(); }

    @GetMapping("/<built-in function id>")
    public Student findById(@PathVariable Long id) { return service.findById(id); }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Student create(@Valid @RequestBody StudentRequest request) {
        return service.create(request);
    }

    @PutMapping("/<built-in function id>")
    public Student update(@PathVariable Long id, @Valid @RequestBody StudentRequest request) {
        return service.update(id, request);
    }

    @DeleteMapping("/<built-in function id>")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void delete(@PathVariable Long id) { service.delete(id); }
}
