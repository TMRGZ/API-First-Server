package com.personal.api_first_server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@EnableConfigServer
@SpringBootApplication
public class ApiFirstServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(ApiFirstServerApplication.class, args);
    }

}
