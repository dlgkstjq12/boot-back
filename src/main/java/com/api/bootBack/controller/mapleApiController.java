package com.api.bootBack.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.api.bootBack.dto.UserDto;
import com.api.bootBack.service.UserService;

@RequestMapping("/mapleApi/users")
@RestController("mapleApiController")
//메이플-파이터 관련 api 컨트롤러
public class mapleApiController {

    private static final Logger logger = LoggerFactory.getLogger(mapleApiController.class);

    @Autowired
    private UserService userService;

    @GetMapping("/testUrl")
    public String testApi() {
        logger.debug("url 연결 테스트");
        return "실행완료";
    }

    @GetMapping("/testDb")
    public List<UserDto> testDb() {
        logger.debug("url 연결 테스트");
        List<UserDto> list = userService.getAllUsers();
        System.out.println(list);
        return list;
    }

    // 회원가입 (POST /mapleApi/users)
    @PostMapping("/users")
    public ResponseEntity<String> register(@RequestBody UserDto user) {
        userService.register(user);
        return ResponseEntity.ok("회원가입 성공");
    }

    // 로그인 (POST /mapleApi/users/login)
    // 내 정보 조회 (GET /mapleApi/users/me)
    // 내 정보 수정 (PUT /mapleApi/users/me)
    // 비밀번호 변경 (PUT /mapleApi/users/me/password)
    // 회원 탈퇴 (DELETE /mapleApi/users/me)
    // 이메일 중복 확인 (GET /mapleApi/users/check-email?email=)

}
