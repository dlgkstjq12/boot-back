package com.maple.mapleBack.controller;

import com.maple.mapleBack.service.ExternalApiService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Map;

@RestController
@RequestMapping("/api")
public class ApiController {
    
    private static final Logger logger = LoggerFactory.getLogger(ApiController.class);

    private final ExternalApiService externalApiService;

    public ApiController(ExternalApiService externalApiService) {
        this.externalApiService = externalApiService;
    }
    
    @GetMapping("/testUrl")
    public void testApi() {
        logger.debug("url 연결 테스트");
    }

    @PostMapping("/chraInfo")
    public ResponseEntity<?> sendToExternalApi(@RequestBody Map<String, String> payload) {
        String name = payload.get("name");
        Map<String, Object> response = externalApiService.sendToCharInfoOpenApi(name);
        return ResponseEntity.ok(response);
    }
}
