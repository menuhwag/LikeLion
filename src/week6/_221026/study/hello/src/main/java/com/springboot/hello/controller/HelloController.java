package com.springboot.hello.controller;

import org.springframework.web.bind.annotation.*;

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

    @GetMapping("/request-param")
    public String reqParam(@RequestParam("name") String name, @RequestParam("age") Integer age) {
        return name + ", " + age + "세";
    }
}
