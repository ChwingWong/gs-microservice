package com.chwing.gs.ms.a;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * Created by Chwing on 2019/7/17.
 */
@SpringBootApplication
@EnableEurekaClient
@EnableDiscoveryClient
public class ServiceAApplication {
    public static void main(String[] args) {
        SpringApplication.run( ServiceAApplication.class, args );
    }
}
