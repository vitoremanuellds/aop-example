package com.example.interceptor.configuration;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

@Aspect
public class InterceptorAspect {

    @Before("@annotation(com.example.interceptor.interceptor.Intercept)")
    public void intercept() {
        var attributes = (ServletRequestAttributes) RequestContextHolder.getRequestAttributes();
        if (attributes == null) {
            return;
        }

        var customHeaderValue = attributes.getRequest().getHeader("custom-header");
        System.out.println(customHeaderValue);
    }
}
