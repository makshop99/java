package com.itfrankfurt.spring.controller;

import org.springframework.context.annotation.Profile;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@Profile("dev")
public class LogController {

    @GetMapping("/logs")
    public List<String> getLogs() {
        return List.of("Log1", "Log2", "Log3");
    }
}
