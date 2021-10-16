package com.example.demo_wwsi;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

    @GetMapping("")
    public String helloMethod(){
        return "Hello from us-west";
    }
}
