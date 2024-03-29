package com.java.buzzquizz.controllers;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/quizzes")
public class QuizzController {
    @GetMapping
    public ResponseEntity getAllQuizzes() {
        return ResponseEntity.ok("Oi");
    }
}
