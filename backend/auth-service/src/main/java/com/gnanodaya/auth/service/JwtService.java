package com.gnanodaya.auth.service;
import com.gnanodaya.auth.entity.User;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.security.Keys;
import java.nio.charset.StandardCharsets;
import java.security.Key;
import java.time.Instant;
import java.time.temporal.ChronoUnit;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
@Service
public class JwtService {
    private final Key key;
    private final long expirationMinutes;
    public JwtService(@Value("${jwt.secret}") String secret,@Value("${jwt.expiration-minutes}") long expirationMinutes) {
        if(secret.length()<32) throw new IllegalArgumentException("JWT secret must contain at least 32 characters");
        key=Keys.hmacShaKeyFor(secret.getBytes(StandardCharsets.UTF_8));
        this.expirationMinutes=expirationMinutes;
    }
    public String generate(User user) {
        Instant now=Instant.now();
        return Jwts.builder().subject(user.getUsername()).claim("role",user.getRole().name())
            .issuedAt(java.util.Date.from(now))
            .expiration(java.util.Date.from(now.plus(expirationMinutes,ChronoUnit.MINUTES)))
            .signWith(key).compact();
    }
}
