package com.api.bootBack.financialProject.service;

import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponentsBuilder;

import com.api.bootBack.financialProject.ApiConstants;

@Service("financialExternalApiService")
public class ExternalApiService {

    private final RestTemplate restTemplate = new RestTemplate();

    // 예금 정보 가져오기위한 API
    public ResponseEntity<String> depositProductsSearch(String apiKey, String topFinGrpNo, String pageNo) {
        String apiUrl = UriComponentsBuilder.fromHttpUrl(ApiConstants.API_URL).queryParam("auth", apiKey)
                .queryParam("topFinGrpNo", topFinGrpNo).queryParam("pageNo", pageNo).build().toUriString();// 예시 URL
        HttpHeaders headers = new HttpHeaders();
        headers.set("Authorization", "Bearer YOUR_TOKEN");
        HttpEntity<String> entity = new HttpEntity<>(headers);
        ResponseEntity<String> response = restTemplate.exchange(apiUrl, HttpMethod.GET, entity, String.class);

        return response;
    }
}