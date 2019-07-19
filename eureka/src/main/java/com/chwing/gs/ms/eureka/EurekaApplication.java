package com.chwing.gs.ms.eureka;

import com.chwing.gs.ms.eureka.config.ApplicationProperties;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * Eureka Application
 * Created by Chwing on 2019/7/16.
 */
@SpringBootApplication
@EnableConfigurationProperties({ApplicationProperties.class})
@EnableEurekaServer
public class EurekaApplication {
    public static void main(String[] args) throws Exception {
        SpringApplication.run(EurekaApplication.class, args);
    }
}
