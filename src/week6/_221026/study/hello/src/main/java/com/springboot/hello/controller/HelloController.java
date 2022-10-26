package com.springboot.hello.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/hello")
public class HelloController {
    @GetMapping("")
    public String hello() {
        return "Hello World";
    }

    @GetMapping("/{value}")
    public String pathValue(@PathVariable("value") String value) {
        return "echo " + value;
    }
}
