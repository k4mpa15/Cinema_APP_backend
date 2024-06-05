package pl.wat.backend.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pl.wat.backend.services.BarService;

import java.util.Map;

@RestController
@RequestMapping("/prices")
public class BarController {

    @Autowired
    private BarService barService;

    @GetMapping("/bar")
    public Map<String, Double> getMenuFromDatabase() {
        return barService.generatePricesFromDatabase();
    }
}
