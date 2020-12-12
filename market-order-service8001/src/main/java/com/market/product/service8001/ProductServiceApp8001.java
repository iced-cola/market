package com.market.product.service8001;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @author :  zhulongkun20@gmail.com
 * @create :  12-11-2020 23:49:01
 * @description :  商品管理模块主启动类
 * @since :  v1.0
 */
@SpringBootApplication
@EnableEurekaClient
public class ProductServiceApp8001 {

    public static void main(String[] args) {
        SpringApplication.run(ProductServiceApp8001.class, args);
    }

}
