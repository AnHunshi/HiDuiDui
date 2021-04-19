package com.hisense;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;

@SpringBootApplication
@ServletComponentScan(basePackages = "com.hisense")
@MapperScan("com.hisense.mapper")
public class ClassroomApplication {
    public static void main(String[] args) {
        SpringApplication.run(ClassroomApplication.class, args);
    }
}