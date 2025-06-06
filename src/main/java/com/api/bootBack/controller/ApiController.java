package com.api.bootBack.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.api.bootBack.service.UserService;

@RequestMapping("/api")
@RestController("apiController")
//메인 api 컨트롤러
public class ApiController {

    private static final Logger logger = LoggerFactory.getLogger(ApiController.class);

    @Autowired
    private UserService userService;

    @GetMapping("/testUrl")
    public String testApi() {
        logger.debug("url 연결 테스트");
        return "실행완료";
    }

}
