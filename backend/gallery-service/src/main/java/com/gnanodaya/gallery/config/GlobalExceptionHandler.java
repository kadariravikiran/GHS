package com.gnanodaya.gallery.config;

import com.gnanodaya.gallery.service.ResourceNotFoundException;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import java.time.Instant;
import java.util.Map;

@RestControllerAdvice
public class GlobalExceptionHandler {
    @ExceptionHandler(ResourceNotFoundException.class)
    @ResponseStatus(HttpStatus.NOT_FOUND)
    public Map<String,Object> notFound(ResourceNotFoundException ex) {
        return Map.of("timestamp",Instant.now(),"status",404,"message",ex.getMessage());
    }
}
