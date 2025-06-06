package com.api.bootBack.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import com.api.bootBack.dto.UserDto;
import com.api.bootBack.mapper.UserMapper;

@Service
public class UserService {

    @Autowired
    private final UserMapper userMapper;

    public UserService(UserMapper userMapper) {
        this.userMapper = userMapper;
    }

    public UserDto getUserById(Long id) {
        return userMapper.findById(id);
    }

    public List<UserDto> getAllUsers() {
        return userMapper.findAll();
    }

    // 회원 가입
    public void register(UserDto user) {

        // 계정 중복 체크
        if (userMapper.findByUsername(user.getEmail())) {
            throw new IllegalArgumentException("이미 존재하는 사용자입니다.");
        }

        // 비밀번호 암호화 (예: BCrypt)
        String hashedPassword = new BCryptPasswordEncoder().encode(user.getPassword());
        user.setPassword(hashedPassword);

    }
}
