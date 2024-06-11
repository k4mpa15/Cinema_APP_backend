package pl.wat.backend.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import pl.wat.backend.services.BiletyService;

import java.util.Map;

@RestController
public class BiletyController {

    @Autowired
    private BiletyService biletyService;

    @GetMapping("/prices/tickets")
    public Map<String, Double> generateTicketPrices() {
        System.out.println(biletyService.generatePrices());
        return biletyService.generatePrices();
    }
}
