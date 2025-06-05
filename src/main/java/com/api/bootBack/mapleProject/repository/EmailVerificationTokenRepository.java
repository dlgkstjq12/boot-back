package com.api.bootBack.mapleProject.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.api.bootBack.mapleProject.entity.EmailVerificationToken;

public interface EmailVerificationTokenRepository extends JpaRepository<EmailVerificationToken, Long> {
    Optional<EmailVerificationToken> findByToken(String token);
}
