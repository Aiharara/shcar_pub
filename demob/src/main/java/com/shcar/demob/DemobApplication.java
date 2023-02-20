package com.shcar.demob;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.PropertySources;

@ServletComponentScan(basePackages = "au.edu.sydney.soft3888.p15.codingFest.filter")
@MapperScan("com.shcar.demob.mapper")
@SpringBootApplication
public class DemobApplication {

    public static void main(String[] args) {
        SpringApplication.run(DemobApplication.class, args);
    }

}
