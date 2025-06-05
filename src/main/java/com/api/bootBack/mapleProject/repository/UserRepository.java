package com.api.bootBack.mapleProject.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.api.bootBack.mapleProject.entity.User;

public interface UserRepository extends JpaRepository<User, Long> {

    // 이메일로 사용자 조회 (주로 로그인, 인증 시 사용)
    Optional<User> findByEmail(String email);

    // 이메일 존재 여부 확인 (회원가입 중복 검사 등에 활용)
    boolean existsByEmail(String email);
}
