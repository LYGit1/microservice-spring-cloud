package com.tommy.cloud.microservicespringclouduser1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class MicroserviceSpringcloudUser1Application {

    public static void main(String[] args) {
        SpringApplication.run(MicroserviceSpringcloudUser1Application.class, args);
    }

}
