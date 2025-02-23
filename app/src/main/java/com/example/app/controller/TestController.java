package com.example.app.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @GetMapping("/test")
    public String test() {
        return "Uygulama çalışıyor - Sunucu: " + System.getenv().getOrDefault("HOSTNAME", "unknown");
    }
} 