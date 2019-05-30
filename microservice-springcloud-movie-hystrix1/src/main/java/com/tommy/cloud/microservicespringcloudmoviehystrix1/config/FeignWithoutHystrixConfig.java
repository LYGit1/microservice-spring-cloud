package com.tommy.cloud.microservicespringcloudmoviehystrix1.config;

import feign.Feign;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class FeignWithoutHystrixConfig {

    @Bean
    @Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
    public Feign.Builder feignBuilder(){
        return new Feign.Builder();
    }
}
