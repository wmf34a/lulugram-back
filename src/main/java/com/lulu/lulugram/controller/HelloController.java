package com.lulu.lulugram.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    @GetMapping("api/hello")
    public String hello() {
        return " ohoh hello hello is anybody here????";
    }
}
