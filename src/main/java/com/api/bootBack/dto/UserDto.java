package com.api.bootBack.dto;

import java.time.LocalDateTime;

public class UserDto {
    private Long id; // serial4 → int
    private String email;
    private String password;
    private String passwordHash;
    private String name; // 이름
    private String phone; // 휴대폰번호
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;
    private Boolean isVerified;
    private Boolean isActive;

    // 기본 생성자
    public UserDto() {
    }

    // id
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    // email
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    // password
    public String getPassword() {
        return passwordHash;
    }

    public void setPassword(String password) {
        this.passwordHash = password;
    }

    // passwordHash
    public String getPasswordHash() {
        return passwordHash;
    }

    public void setPasswordHash(String passwordHash) {
        this.passwordHash = passwordHash;
    }

    // name
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    // phone
    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    // createdAt
    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(LocalDateTime createdAt) {
        this.createdAt = createdAt;
    }

    // updatedAt
    public LocalDateTime getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(LocalDateTime updatedAt) {
        this.updatedAt = updatedAt;
    }

    // isVerified
    public Boolean getIsVerified() {
        return isVerified;
    }

    public void setIsVerified(Boolean isVerified) {
        this.isVerified = isVerified;
    }

    // isActive
    public Boolean getIsActive() {
        return isActive;
    }

    public void setIsActive(Boolean isActive) {
        this.isActive = isActive;
    }

    public UserDto(Long id, String email, String passwordHash, String name, Boolean isVerified, Boolean isActive) {
        this.id = (long) (id != null ? id.intValue() : 0); // id가 Long이라면 int 변환 처리 필요
        this.email = email;
        this.passwordHash = passwordHash;
        this.name = name;
        this.isVerified = isVerified;
        this.isActive = isActive;
    }

}