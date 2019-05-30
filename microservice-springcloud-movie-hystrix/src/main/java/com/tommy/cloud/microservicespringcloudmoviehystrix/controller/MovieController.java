package com.tommy.cloud.microservicespringcloudmoviehystrix.controller;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.netflix.ribbon.proxy.annotation.Hystrix;
import com.tommy.cloud.microservicespringcloudmoviehystrix.entity.User;
import com.tommy.cloud.microservicespringcloudmoviehystrix.feign.UserFeignClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class MovieController {
    @Autowired
    private RestTemplate restTemplate;

    @Autowired
    private UserFeignClient client;

    @GetMapping("/movie/{id}")
    public User findUserById(@PathVariable Long id){
        return restTemplate.getForObject("http://localhost:7902/sample/"+id,User.class);
    }

    /**
     * @description feign方式通过eureka调用microservice-springcloud-user
     * @param id
     * @return
     */
    @GetMapping("/user/{id}")
    @HystrixCommand(fallbackMethod = "getUserFallback")
    public User getUser(@PathVariable Long id){
        return client.getUser(id);
    }

    public User getUserFallback(Long id){
        User user = new User();
        user.setId(0L);
        return user;
    }
}
