package com.hkanwal.gql.controller;

import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;

@Controller
public class SampleController {
    @QueryMapping
    public String getString() {
        return "Hello client! - from server";
    }
}
