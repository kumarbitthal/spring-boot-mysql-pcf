package com.javatechie.myreview.api.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/spring-jdbc-dummy")
public class DummyController {

    @GetMapping("/hello")
    public String dummy() {
        return "Hello Dummy Controller !";
    }
}
