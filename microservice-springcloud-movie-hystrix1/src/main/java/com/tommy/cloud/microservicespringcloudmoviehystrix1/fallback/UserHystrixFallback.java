package com.tommy.cloud.microservicespringcloudmoviehystrix1.fallback;

import com.tommy.cloud.microservicespringcloudmoviehystrix1.entity.User;
import com.tommy.cloud.microservicespringcloudmoviehystrix1.feign.UserFeignClient;
import org.springframework.stereotype.Component;

@Component
public class UserHystrixFallback implements UserFeignClient {
    @Override
    public User getUser(Long id) {
        User user = new User();
        user.setId(0L);
        return user;
    }
}
