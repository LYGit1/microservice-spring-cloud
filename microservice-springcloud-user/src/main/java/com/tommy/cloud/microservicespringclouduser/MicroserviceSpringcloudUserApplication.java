package com.tommy.cloud.microservicespringclouduser;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@EnableEurekaClient
@RestController
@RefreshScope
public class MicroserviceSpringcloudUserApplication {

    @Value("${foo}")
    String foo;

    @GetMapping("/hi")
    public String hi(){
        return foo;
    }

    public static void main(String[] args) {
        SpringApplication.run(MicroserviceSpringcloudUserApplication.class, args);
    }

}
