package com.travis.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CICDController {

    @GetMapping("/hello")
    public String hello() {
        return "Hello CI/CD...";
    }
}
