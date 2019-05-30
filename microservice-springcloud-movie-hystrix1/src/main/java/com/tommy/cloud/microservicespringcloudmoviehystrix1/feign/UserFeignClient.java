package com.tommy.cloud.microservicespringcloudmoviehystrix1.feign;

import com.tommy.cloud.microservicespringcloudmoviehystrix1.entity.User;
import com.tommy.cloud.microservicespringcloudmoviehystrix1.fallback.UserHystrixFallback;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(value = "microservice-springcloud-user",fallback = UserHystrixFallback.class)
public interface UserFeignClient {
    @GetMapping("/sample/{id}")
    User getUser(@PathVariable Long id);
}
