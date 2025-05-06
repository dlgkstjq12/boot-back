package com.api.bootBack.controller.mapleProject;

import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.api.bootBack.service.mapleProject.ExternalApiService;

@RestController
@RequestMapping("/api")
public class ApiController {

    private static final Logger logger = LoggerFactory.getLogger(ApiController.class);

    private final ExternalApiService externalApiService;

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
}
