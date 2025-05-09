package com.api.bootBack.financialProject.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.api.bootBack.financialProject.ApiConstants;
import com.api.bootBack.financialProject.service.ExternalApiService;

@RestController("financialApiController")
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

    // 금융감독원 정기예금 sample api 호출
    // 예제url
    // http://finlife.fss.or.kr/finlifeapi/depositProductsSearch.json?auth={발급받은
    // 인증키}&topFinGrpNo=020000&pageNo=1
    @GetMapping("/depositProductsSearch")
    public ResponseEntity<String> depositProductsSearch(@RequestParam String topFinGrpNo, @RequestParam String pageNo) {
        String apiKey = ApiConstants.API_KEY;
        ResponseEntity<String> response = externalApiService.depositProductsSearch(apiKey, topFinGrpNo, pageNo);
        return response;
    }

}
