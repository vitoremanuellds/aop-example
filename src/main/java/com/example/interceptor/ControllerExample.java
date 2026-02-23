package com.example.interceptor;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.interceptor.interceptor.Intercept;

@RestController
public class ControllerExample {

    @GetMapping("/hello")
    public ResponseEntity<String> hello() {
        return ResponseEntity.ok("Hello World!");
    }

    @GetMapping("/intercept")
    @Intercept
    public ResponseEntity<String> intercept() {
        return ResponseEntity.ok("Intercepted!");
    }

}
