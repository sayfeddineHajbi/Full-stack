package com.example.helloauth.demo;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(origins = "http://localhost:65317/")
@RestController
public class hello {
   @GetMapping("/hello")
       public ResponseEntity<String> Hello() {
           return ResponseEntity.ok("Hello World");
       }
   }

