package pl.wat.backend.services;

import org.springframework.stereotype.Service;
import pl.wat.backend.records.Greeting;

import java.util.concurrent.atomic.AtomicLong;

@Service
public class GreetingService {

    private static final String template = "Hello, %s!";
    private final AtomicLong counter = new AtomicLong();

    public Greeting generateGreeting(String name) {
        return new Greeting(counter.incrementAndGet(), String.format(template, name));
    }

}
