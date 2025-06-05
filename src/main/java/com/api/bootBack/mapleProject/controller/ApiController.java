package com.api.bootBack.mapleProject.controller;

import java.util.List;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.api.bootBack.mapleProject.entity.User;
import com.api.bootBack.mapleProject.service.ExternalApiService;
import com.api.bootBack.mapleProject.service.UserTestService;

@RequestMapping("/mapleApi")
@RestController("mapleApiController")
//메이플 프로젝트 관련 API 컨트롤러
public class ApiController {

    private static final Logger logger = LoggerFactory.getLogger(ApiController.class);

    private final ExternalApiService externalApiService;

    private UserTestService userTestService;

    public ApiController(ExternalApiService externalApiService) {
        this.externalApiService = externalApiService;
    }

    @GetMapping("/testUrl")
    public String testApi() {
        logger.debug("url 연결 테스트");
        return "실행완료";
    }

    @PostMapping("/chraInfo")
    public ResponseEntity<?> sendToExternalApi(@RequestBody Map<String, String> payload) {
        String name = payload.get("name");
        Map<String, Object> response = externalApiService.sendToCharInfoOpenApi(name);
        return ResponseEntity.ok(response);
    }

    public ApiController(UserTestService userTestService) {
        this.userTestService = userTestService;
        this.externalApiService = new ExternalApiService();
    }

    @GetMapping("/test/users")
    public List<User> getUsers() {
        return userTestService.getAllUsers();
    }
}
