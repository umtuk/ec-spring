package org.ec.testmvc.greeting.controller;

import lombok.RequiredArgsConstructor;
import org.ec.testmvc.greeting.domain.Greeting;
import org.ec.testmvc.greeting.service.GreetingService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
@RequestMapping("/greeting")
public class GreetingController {

    private final GreetingService greetingService;

    @GetMapping
    public Iterable<Greeting> readAll() {
        return greetingService.readAll();
    }

    @PostMapping
    public Greeting create(@RequestBody Greeting greeting) {
        return greetingService.create(greeting);
    }
}
