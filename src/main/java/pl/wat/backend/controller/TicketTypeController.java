package pl.wat.backend.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import pl.wat.backend.services.TicketTypeService;

import java.util.Map;

@RestController
public class TicketTypeController {

    @Autowired
    private TicketTypeService ticketTypeService;

    @GetMapping("/prices/tickets")
    public Map<String, Double> generateTicketPrices() {
        System.out.println(ticketTypeService.generatePrices());
        return ticketTypeService.generatePrices();
    }
}
