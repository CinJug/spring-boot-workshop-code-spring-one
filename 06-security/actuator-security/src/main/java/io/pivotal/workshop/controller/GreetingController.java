package io.pivotal.workshop.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.actuate.metrics.CounterService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetingController {

    private final CounterService counterService;

    @Autowired
    public GreetingController(CounterService counterService){
        this.counterService = counterService;
    }

    @GetMapping("/")
    public String hello() {
        counterService.increment("counter.services.greeting.invoked");
        return "Hello World!!!";
    }
}
