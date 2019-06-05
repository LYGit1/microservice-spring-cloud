package com.tommy.cloud.microservicespringclouduser1;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@EnableEurekaClient
@RestController
@EnableHystrix
@EnableHystrixDashboard
@EnableCircuitBreaker
public class MicroserviceSpringcloudUser1Application {

    @Value("${foo}")
    private String foo;

    @GetMapping("/hi")
    @HystrixCommand(fallbackMethod = "hiFallback")
    public String hi(){
        return foo;
    }

    public String hiFallback(){
        return "error";
    }

    public static void main(String[] args) {
        SpringApplication.run(MicroserviceSpringcloudUser1Application.class, args);
    }

}
