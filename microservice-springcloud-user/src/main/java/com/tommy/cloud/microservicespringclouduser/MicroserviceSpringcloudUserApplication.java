package com.tommy.cloud.microservicespringclouduser;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class MicroserviceSpringcloudUserApplication {

    public static void main(String[] args) {
        SpringApplication.run(MicroserviceSpringcloudUserApplication.class, args);
    }

}
