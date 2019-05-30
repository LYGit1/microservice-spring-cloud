package com.tommy.cloud.microservicespringcloudmoviehystrix.feign;

import com.tommy.cloud.microservicespringcloudmoviehystrix.entity.User;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient("microservice-springcloud-user")
public interface UserFeignClient {
    @GetMapping("/sample/{id}")  //这里的path必须和调用的服务的path相同
    User getUser(@PathVariable Long id);
}
