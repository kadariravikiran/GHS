package com.gnanodaya.auth.service;
import com.gnanodaya.auth.dto.*;
import com.gnanodaya.auth.entity.*;
import com.gnanodaya.auth.repository.UserRepository;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
@Service
public class AuthService {
    private final UserRepository repository;
    private final PasswordEncoder encoder;
    private final JwtService jwtService;
    public AuthService(UserRepository repository,PasswordEncoder encoder,JwtService jwtService){
        this.repository=repository; this.encoder=encoder; this.jwtService=jwtService;
    }
    public AuthResponse register(RegisterRequest request){
        if(repository.existsByUsername(request.getUsername())) throw new IllegalArgumentException("Username already exists");
        User user=new User(); user.setUsername(request.getUsername());
        user.setPasswordHash(encoder.encode(request.getPassword())); user.setRole(Role.PARENT);
        repository.save(user);
        return new AuthResponse(jwtService.generate(user),user.getUsername(),user.getRole().name());
    }
    public AuthResponse login(LoginRequest request){
        User user=repository.findByUsername(request.getUsername())
            .orElseThrow(()->new IllegalArgumentException("Invalid username or password"));
        if(!encoder.matches(request.getPassword(),user.getPasswordHash()))
            throw new IllegalArgumentException("Invalid username or password");
        return new AuthResponse(jwtService.generate(user),user.getUsername(),user.getRole().name());
    }
}
