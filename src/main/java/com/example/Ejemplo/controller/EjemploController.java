package com.example.Ejemplo.controller;

import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
public class EjemploController {
    @PostMapping("/ejemplo")
    public String index(@RequestBody Map<String, Object> requestBody) {
        String name = requestBody.get("name").toString();
        return "Hello World " + name;
    }
}