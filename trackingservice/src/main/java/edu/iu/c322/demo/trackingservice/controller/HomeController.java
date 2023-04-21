package edu.iu.c322.demo.trackingservice.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/tracking")
public class HomeController {

    @GetMapping
    public String greetings() {
        return "Greetings from the tracking service!";
    }
    
}
