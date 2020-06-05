package com.gus.microservice.bureau;

import org.springframework.boot.SpringApplication;
//import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
//@EnableAutoConfiguration
public class BureauApp {
    //
    public static void main(String[] args) {
        //
        SpringApplication.run(BureauApp.class, args);
    }
}
