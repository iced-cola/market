package com.market.server7001;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @author :  zhulongkun20@gmail.com
 * @create :  12-11-2020 20:24:01
 * @description :  Eureka注册中心7001
 * @since :  v1.0
 */
@SpringBootApplication
@EnableEurekaServer
public class EurekaServerApp7001 {

    public static void main(String[] args) {
        SpringApplication.run(EurekaServerApp7001.class, args);
    }

}
