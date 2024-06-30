package com.ivoyant.springbootblogrestapi.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Test {
        @GetMapping("/test")
        public String apitesting() {
            return "Hello World From CICD Deployment";
        }
}
