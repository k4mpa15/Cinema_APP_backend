package pl.wat.testtt;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetingController {

    @Autowired
    private GreetingService greetingService;

    @GetMapping("/greeting")
    public Greeting greeting(@RequestParam(value = "name", defaultValue = "World") String name) {
        return greetingService.generateGreeting(name);
    }

    @GetMapping("/m_to_cm")
    public String m_to_cm(@RequestParam(value = "m", defaultValue = "1") int m) {
        return greetingService.m_to_cm(m);
    }

    @GetMapping("/cm_to_m")
    public String cm_to_m(@RequestParam(value = "cm", defaultValue = "100") double cm) {
        return greetingService.cm_to_m(cm);
    }

    @GetMapping("/ft_to_m")
    public Foot_to_meters foot_to_meteres(@RequestParam(value = "ft", defaultValue = "1") double ft) {
        return greetingService.ft_to_m(ft);
    }

    @GetMapping("/m_to_ft")
    public Meters_to_foot meters_to_foot(@RequestParam(value = "m", defaultValue = "1") double m) {
        return greetingService.m_to_ft(m);
    }
}
