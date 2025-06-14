package com.api.bootBack;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.*;

@Configuration
public class WebConfig implements WebMvcConfigurer {

    // 로컬, 운영, 개발 주소가 서로 각각 다르므로 허용할 url을 다르게 셋팅하기위한 변수
    @Value("${cors.allowed-origin}")
    private String allowedOrigin;
    
    @Override
    public void addCorsMappings(CorsRegistry registry) {
        registry.addMapping("/api/**").allowedOrigins(allowedOrigin) // React 개발 서버 주소
                .allowedMethods("*").allowedHeaders("*").allowCredentials(true);
    }
}