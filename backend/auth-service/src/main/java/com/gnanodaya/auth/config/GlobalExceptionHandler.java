package com.gnanodaya.auth.config;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.*;
import java.time.Instant;
import java.util.Map;
@RestControllerAdvice
public class GlobalExceptionHandler {
    @ExceptionHandler(IllegalArgumentException.class)
    @ResponseStatus(HttpStatus.BAD_REQUEST)
    public Map<String,Object> badRequest(IllegalArgumentException ex){
        return Map.of("timestamp",Instant.now(),"status",400,"message",ex.getMessage());
    }
    @ExceptionHandler(MethodArgumentNotValidException.class)
    @ResponseStatus(HttpStatus.BAD_REQUEST)
    public Map<String,Object> validation(MethodArgumentNotValidException ex){
        return Map.of("timestamp",Instant.now(),"status",400,"message","Validation failed");
    }
}
