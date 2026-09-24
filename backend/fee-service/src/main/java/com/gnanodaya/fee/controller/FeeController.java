package com.gnanodaya.fee.controller;

import com.gnanodaya.fee.dto.FeeRequest;
import com.gnanodaya.fee.entity.Fee;
import com.gnanodaya.fee.service.FeeService;
import jakarta.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/fees")
public class FeeController {
    private final FeeService service;

    public FeeController(FeeService service) { this.service=service; }

    @GetMapping
    public List<Fee> findAll() { return service.findAll(); }

    @GetMapping("/<built-in function id>")
    public Fee findById(@PathVariable Long id) { return service.findById(id); }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Fee create(@Valid @RequestBody FeeRequest request) {
        return service.create(request);
    }

    @PutMapping("/<built-in function id>")
    public Fee update(@PathVariable Long id, @Valid @RequestBody FeeRequest request) {
        return service.update(id, request);
    }

    @DeleteMapping("/<built-in function id>")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void delete(@PathVariable Long id) { service.delete(id); }
}
