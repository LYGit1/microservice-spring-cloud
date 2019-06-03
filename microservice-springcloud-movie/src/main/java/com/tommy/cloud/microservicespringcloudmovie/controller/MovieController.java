package com.tommy.cloud.microservicespringcloudmovie.controller;

import com.tommy.cloud.microservicespringcloudmovie.entity.User;
import com.tommy.cloud.microservicespringcloudmovie.feign.UserFeignClient;
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

    @GetMapping("/ribbon/{id}")
    public User findUserByIdClientName(@PathVariable Long id){
        return restTemplate.getForObject("http://microservice-springcloud-user/sample/"+id,User.class);
    }

    /**
     * @description feign方式通过eureka调用microservice-springcloud-user
     * @param id
     * @return
     */
    @GetMapping("/user/{id}")
    public User getUser(@PathVariable Long id){
        return client.getUser(id);
    }
}
