package com.api.bootBack.mapleProject.service;

import java.util.HashMap;
import java.util.Map;

import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service("mapleExternalApiService")
public class ExternalApiService {

    private final RestTemplate restTemplate = new RestTemplate();

    // 캐릭터 정보 가져오기위한 send
    public Map<String, Object> sendToCharInfoOpenApi(String name) {
        String apiUrl = "https://api.publicapis.org/entries"; // 예시 API

        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_JSON);

        Map<String, String> requestPayload = new HashMap<>();
        requestPayload.put("query", name);

        HttpEntity<Map<String, String>> request = new HttpEntity<>(requestPayload, headers);

        ResponseEntity<Map> response = restTemplate.postForEntity(apiUrl, request, Map.class);

        return response.getBody();
    }
}