package com.tommy.cloud.microservicediscoveryeureka1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class MicroserviceDiscoveryEureka1Application {

    public static void main(String[] args) {
        SpringApplication.run(MicroserviceDiscoveryEureka1Application.class, args);
    }

}
