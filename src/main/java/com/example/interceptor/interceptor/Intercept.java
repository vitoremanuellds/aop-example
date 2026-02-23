package com.example.interceptor.interceptor;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.RUNTIME)
public @interface Intercept {
    String value() default "Empty";
}
