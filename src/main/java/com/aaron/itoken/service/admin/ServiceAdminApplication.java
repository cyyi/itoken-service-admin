package com.aaron.itoken.service.admin;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;

@SpringBootApplication
@EnableEurekaClient
@MapperScan(basePackages = "com.aaron.itoken.service.admin.mapper")
public class ServiceAdminApplication {
    public static void main(String[] args) {
        SpringApplication.run(ServiceAdminApplication.class, args);
    }
}
