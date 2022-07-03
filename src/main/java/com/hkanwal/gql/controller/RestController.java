package com.hkanwal.gql.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@org.springframework.web.bind.annotation.RestController
@RequestMapping("/api")
public class RestController {
    @GetMapping
    public String helloWorld() {
        return "Hello world from REST endpoint!";
    }
}
