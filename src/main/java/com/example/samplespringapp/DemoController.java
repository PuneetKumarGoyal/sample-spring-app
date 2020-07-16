package com.example.samplespringapp;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

    @GetMapping("/sayhello")
    public String sayHello(){
        return "saying hello from sample spring boot app";
    }
    @GetMapping("/saybye")
    public String sayHello(){
        return "saying bye from sample spring boot app";
    }
}
