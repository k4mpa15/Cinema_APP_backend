package pl.wat.backend.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import pl.wat.backend.services.TicketService;

import java.util.Map;

@RestController
public class TicketController {

    @Autowired
    private TicketService TicketService;

    @GetMapping("/ticket")
    public Map<String, String> Ticket() {
        System.out.println(TicketService.generatePrices());
        return TicketService.generatePrices();
    }
}
