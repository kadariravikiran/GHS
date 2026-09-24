package com.gnanodaya.auth.entity;
import jakarta.persistence.*;
@Entity
@Table(name="users")
public class User {
    @Id @GeneratedValue(strategy=GenerationType.IDENTITY) private Long id;
    @Column(nullable=false,unique=true) private String username;
    @Column(nullable=false) private String passwordHash;
    @Enumerated(EnumType.STRING) @Column(nullable=false) private Role role=Role.PARENT;
    public Long getId(){return id;}
    public String getUsername(){return username;}
    public void setUsername(String v){username=v;}
    public String getPasswordHash(){return passwordHash;}
    public void setPasswordHash(String v){passwordHash=v;}
    public Role getRole(){return role;}
    public void setRole(Role v){role=v;}
}
