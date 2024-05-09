package pl.wat.backend.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import pl.wat.backend.Greeting;
import pl.wat.backend.GreetingService;

@RestController
public class PricesController {

    @Autowired
    private GreetingService greetingService;

    @GetMapping("/prices/giftcard")
    public Greeting greeting(@RequestParam(value = "name", defaultValue = "World") String name) {
        return greetingService.generateGreeting(name);
    }


}
