package com.market.server7002;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @author :  zhulongkun20@gmail.com
 * @create :  12-11-2020 22:27:23
 * @description :  Eureka注册中心7002
 * @since :  v1.0
 */
@SpringBootApplication
@EnableEurekaServer
public class EurekaServerApp7002 {

    public static void main(String[] args) {
        SpringApplication.run(EurekaServerApp7002.class, args);
    }

}
