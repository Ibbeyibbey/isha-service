package com.hcl.ishaservice;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.atomic.AtomicLong;

@RestController
public class GreetController {

    private static final String template = "Hi There, %s!";
    private final AtomicLong counter = new AtomicLong();

    @GetMapping("/greet")
    Greet greet(@RequestParam(defaultValue = "World") String name) {
        return new Greet(counter.incrementAndGet(),String.format(template, name));
    }

}
