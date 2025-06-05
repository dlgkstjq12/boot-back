package com.api.bootBack.mapleProject.entity;

import java.time.LocalDateTime;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "users", schema = "public")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) // PostgreSQL 시퀀스 자동 증가
    private Long id;

    @Column(nullable = false, unique = true, length = 100)
    private String email; // 사용자 이메일 (고유)

    @Column(name = "password_hash", nullable = false)
    private String passwordHash; // 해시된 비밀번호

    @Column(length = 100)
    private String name; // 사용자 이름

    @Column(length = 20)
    private String phone; // 전화번호

    @Column(name = "is_verified", nullable = false)
    private Boolean isVerified; // 이메일 인증 여부

    @Column(name = "is_active", nullable = false)
    private Boolean isActive; // 계정 활성화 여부

    @Column(name = "created_at", nullable = false)
    private LocalDateTime createdAt; // 생성일

    @Column(name = "updated_at", nullable = false)
    private LocalDateTime updatedAt; // 수정일

    // === Getter / Setter ===

    public Long getId() {
        return id;
    }

    public String getEmail() {
        return email;
    }

    public String getPasswordHash() {
        return passwordHash;
    }

    public String getName() {
        return name;
    }

    public String getPhone() {
        return phone;
    }

    public Boolean getIsVerified() {
        return isVerified;
    }

    public Boolean getIsActive() {
        return isActive;
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    public LocalDateTime getUpdatedAt() {
        return updatedAt;
    }

    // === Builder 또는 Setter를 원하면 추가 가능 ===

    // (예: public void setEmail(String email) 등)

    // === 생성자 ===

    protected User() {
        // JPA 기본 생성자
    }

    public User(String email, String passwordHash, String name, String phone, Boolean isVerified, Boolean isActive,
            LocalDateTime createdAt, LocalDateTime updatedAt) {
        this.email = email;
        this.passwordHash = passwordHash;
        this.name = name;
        this.phone = phone;
        this.isVerified = isVerified;
        this.isActive = isActive;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
    }
}
