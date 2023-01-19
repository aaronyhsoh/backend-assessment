package com.example.backendtest.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SmartContractController {

    @PostMapping("/send")
    public ResponseEntity send() {
        return ResponseEntity.ok("success");
    }

    @PostMapping("/get-balance")
    public ResponseEntity getBalance() {
        return ResponseEntity.ok("success");
    }
}
