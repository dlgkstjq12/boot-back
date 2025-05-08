package com.api.bootBack.financialProject.controller;

import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.api.bootBack.mapleProject.service.ExternalApiService;

@RestController
@RequestMapping("/financialApi")
//금융 프로젝트 관련 API 컨트롤러
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
    
    //금융 sample api 호출
    //예제url
    //http://finlife.fss.or.kr/finlifeapi/depositProductsSearch.json?auth={발급받은 인증키}&topFinGrpNo=020000&pageNo=1

    
}
