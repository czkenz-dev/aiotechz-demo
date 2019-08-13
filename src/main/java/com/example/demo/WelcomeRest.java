package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomeRest {

    @GetMapping
    public String hello(){
        return "It deploy by jenkins, I'm Java RockStar.";
    }

}
