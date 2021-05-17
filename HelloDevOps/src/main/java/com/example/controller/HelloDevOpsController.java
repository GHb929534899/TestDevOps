package com.example.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/devops")
@RestController
public class HelloDevOpsController {

    @GetMapping("/hello")
    public String HelloDevOps() {
        return "Hello DevOps";
    }

}
