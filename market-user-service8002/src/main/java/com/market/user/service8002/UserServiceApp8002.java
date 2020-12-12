package com.market.user.service8002;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class UserServiceApp8002 {

    public static void main(String[] args) {
        SpringApplication.run(UserServiceApp8002.class, args);
    }

}
