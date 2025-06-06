package com.api.bootBack;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.api.bootBack.*")
public class BootBackApplication {

    public static void main(String[] args) {
        SpringApplication.run(BootBackApplication.class, args);
    }

}
