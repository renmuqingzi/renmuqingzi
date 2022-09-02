package com.example.renmuqingzi;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan(basePackages = "com.example.renmuqingzi.*")
public class RenmuqingziApplication {

    public static void main(String[] args) {
        SpringApplication.run(RenmuqingziApplication.class, args);
    }

}
