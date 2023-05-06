package main.java.Controllers;

import java.util.concurrent.atomic.AtomicLong;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import main.java.Objects.Greeting;

@CrossOrigin(maxAge=3600)
@RestController
public class GreetingController {

	private static final String template = "Oats";
	private static final String template2 = "Thanks, added %s!";
	private final AtomicLong counter = new AtomicLong();

	@GetMapping("/greeting")
	public Greeting greeting(@RequestParam(value = "name", defaultValue = "Oats") String name) {
		return new Greeting(counter.incrementAndGet(), String.format(template, name));
	}

	@PostMapping("/greeting")
	public Greeting greetingp(@RequestParam(value = "name", defaultValue = "Oats") String name) {
		return new Greeting(counter.incrementAndGet(), String.format(template2, name));
	}
}