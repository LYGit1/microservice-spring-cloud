package com.tommy.cloud.microservicespringcloudmovie.controller;

import com.tommy.cloud.microservicespringcloudmovie.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class MovieController {
    @Autowired
    private RestTemplate restTemplate;

    @GetMapping("/movie/{id}")
    public User findUserById(@PathVariable Long id){
        return restTemplate.getForObject("http://localhost:7902/sample/"+id,User.class);
    }
}
