package com.example.interceptor.configuration;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import com.example.interceptor.interceptor.Intercept;

@Aspect
public class InterceptorAspect {

    @Before("@annotation(interceptInstance)")
    public void intercept(Intercept interceptInstance) {
        var attributes = (ServletRequestAttributes) RequestContextHolder.getRequestAttributes();
        if (attributes == null) {
            return;
        }

        var customHeaderValue = attributes.getRequest().getHeader("custom-header");
        System.out.println(interceptInstance.value());
        System.out.println(customHeaderValue);
    }
}
