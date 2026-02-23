package com.example.interceptor.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@EnableAspectJAutoProxy
public class AspectJConfiguration {

    @Bean
    public InterceptorAspect interceptorAspect() {
        return new InterceptorAspect();
    }
}
