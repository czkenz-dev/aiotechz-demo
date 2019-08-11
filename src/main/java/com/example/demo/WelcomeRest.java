package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomeRest {

    @GetMapping
    public String hello(){
        return "Hello World, I'm Java RockStar";
    }

}
