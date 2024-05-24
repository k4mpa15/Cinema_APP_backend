package pl.wat.backend.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import pl.wat.backend.services.BarService;

import java.util.Map;

@RestController
public class BarController {

    @Autowired
    private BarService BarService;

    @GetMapping("/prices/bar")
    public Map<String, String> Bar() {
        System.out.println(BarService.generatePrices());
        return BarService.generatePrices();
    }
}
