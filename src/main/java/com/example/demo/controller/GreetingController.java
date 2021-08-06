package com.example.demo.controller;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.atomic.AtomicLong;

@RestController
@RequestMapping(value = "/test")
public class GreetingController {
    private static final String template = "Hello, %s!";
    private final AtomicLong counter = new AtomicLong();
//    @RequestMapping(value = "/swagger")
//    public Greeting greeting(@RequestParam(value = "name", defaultValue = "World") String name) {
//        return new Greeting(counter.incrementAndGet(), String.format(template, name));
//    }
//    public Greeting greeting(@RequestParam(value = "name", defaultValue = "World") String name) {
//        return new Greeting(counter.incrementAndGet(), String.format(template, name));
//    }
}
