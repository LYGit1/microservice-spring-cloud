package com.tommy.cloud.microservicespringclouduser1.controller;

import com.tommy.cloud.microservicespringclouduser1.entity.User;
import com.tommy.cloud.microservicespringclouduser1.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
    @Autowired
    private UserRepository userRepository;

    @GetMapping("/sample/{id}")
    public User findById(@PathVariable Long id){
        return userRepository.getOne(id);
    }
}
