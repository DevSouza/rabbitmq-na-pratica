package br.com.devsouza.producer.controllers;

import org.springframework.web.bind.annotation.RestController;

import br.com.devsouza.producer.services.StringService;
import lombok.RequiredArgsConstructor;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.GetMapping;



@RestController
@RequiredArgsConstructor
@RequestMapping("/produces")
public class StringController {

    private final StringService service;

    @GetMapping
    public ResponseEntity<String> produces(@RequestParam String message) {
        service.produce(message);
        return ResponseEntity.ok().body("Sending message");
    }

}
