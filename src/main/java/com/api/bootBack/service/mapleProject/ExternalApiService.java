package com.api.bootBack.service.mapleProject;

import org.springframework.http.*;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.HashMap;
import java.util.Map;

@Service
public class ExternalApiService {

    private final RestTemplate restTemplate = new RestTemplate();
    
    //캐릭터 정보 가져오기위한 send
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