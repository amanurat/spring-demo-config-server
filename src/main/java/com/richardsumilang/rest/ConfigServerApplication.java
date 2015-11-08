package com.richardsumilang.rest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.monitor.GithubPropertyPathNotificationExtractor;
import org.springframework.cloud.config.server.EnableConfigServer;
import org.springframework.context.annotation.Bean;

/**
 * Put config services behind load balancer
 */

@SpringBootApplication
@EnableConfigServer
public class ConfigServerApplication {



    public static void main(String[] args) {
        SpringApplication.run(ConfigServerApplication.class, args);
    }
}
