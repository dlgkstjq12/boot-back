package com.maple.mapleBack;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController  // JSON 또는 텍스트 반환하는 REST 컨트롤러
public class charViewController {
    @GetMapping("/") // 루트 경로로 GET 요청이 들어오면 실행됨
    public String hello() {
        return "Hello World";
    }

}
