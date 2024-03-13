package pl.wat.testtt;

import org.springframework.stereotype.Service;

import java.util.concurrent.atomic.AtomicLong;

@Service
public class GreetingService {

    private static final String template = "Hello, %s!";
    private final AtomicLong counter = new AtomicLong();

    public Greeting generateGreeting(String name) {
        return new Greeting(counter.incrementAndGet(), String.format(template, name));
    }

    public String m_to_cm(int m) {
        int cm = 100*m;
        String cm_string = Integer.toString(cm);
        return new String(cm_string);
    }

    public String cm_to_m(double cm) {
        double m = cm/100;
        String m_string = Double.toString(m);
        return new String(m_string);
    }

    public Foot_to_meters ft_to_m(double ft) {
        double m = ft*0.3048;
        return new Foot_to_meters(ft, m);
    }
}
