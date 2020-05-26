package com.example.restservice;
import java.util.concurrent.atomic.AtomicLong;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetingController {
    private static final String template = "Price of the room is $ %s!";
	private final AtomicLong counter = new AtomicLong();

	@GetMapping("/rest-service")
	public Greeting greeting(@RequestParam(value = "rent", defaultValue = "100") String name) {
		return new Greeting(counter.incrementAndGet(), String.format(template, name));
	}
}