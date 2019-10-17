package com.programmerhub;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@MapperScan("com.programmerhub.user.mapper")
@EnableEurekaClient
public class UserServiceStarter {
    public static void main(String[] args) {
        SpringApplication.run(UserServiceStarter.class, args);
    }
}
