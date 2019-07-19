package com.chwing.gs.ms.eureka.config;

import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * Properties specific to Msgwjh.
 * <p>
 * Properties are configured in the {@code application.yml} file.
 */
@ConfigurationProperties(prefix = "application", ignoreUnknownFields = false)
public class ApplicationProperties {

}
