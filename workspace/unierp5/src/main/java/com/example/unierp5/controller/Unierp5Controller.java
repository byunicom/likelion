package com.example.unierp5.controller;

import com.example.unierp5.domain.Unierp5;
import com.example.unierp5.service.Unierp5Service;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/unierp5")
@RequiredArgsConstructor
public class Unierp5Controller {
    private final Unierp5Service unierp5Service;
    @GetMapping
    public ResponseEntity<List<Unierp5>> getUnierp5s(){
//        return  ResponseEntity.ok(unierp5Service)
        return null;
    }
}
