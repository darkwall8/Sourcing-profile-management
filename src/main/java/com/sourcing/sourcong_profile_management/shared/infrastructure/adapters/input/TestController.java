package com.sourcing.sourcong_profile_management.shared.infrastructure.adapters.input;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1")
public class TestController {
    @GetMapping("/echo")
    public ResponseEntity<String> ListenAPI() {
        return ResponseEntity.ok("Hello World !");
    }
}
