package com.gnanodaya.auth.service;
import com.gnanodaya.auth.dto.RegisterRequest;
import com.gnanodaya.auth.repository.UserRepository;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.*;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.security.crypto.password.PasswordEncoder;
import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;
@ExtendWith(MockitoExtension.class)
class AuthServiceTest {
    @Mock UserRepository repository;
    @Mock PasswordEncoder encoder;
    @Mock JwtService jwtService;
    @InjectMocks AuthService service;
    @Test void registerRejectsExistingUsername(){
        RegisterRequest r=new RegisterRequest(); r.setUsername("parent1"); r.setPassword("secret");
        when(repository.existsByUsername("parent1")).thenReturn(true);
        assertThrows(IllegalArgumentException.class,()->service.register(r));
    }
}
