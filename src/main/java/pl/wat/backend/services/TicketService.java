package pl.wat.backend.services;

import org.springframework.stereotype.Service;

import java.util.LinkedHashMap;
import java.util.Map;

@Service
public class TicketService {

    private String[] categories = {"Normalny", "Ulgowy", "Dla seniora", "Dzieciecy"};

    private String[] prices = {"30.00 zl", "20.00 zl", "25.00 zl", "15.00 zl"};

    public Map<String, String> generatePrices() {
        Map<String, String> tickets = new LinkedHashMap<>();
        for (int i = 0; i < categories.length; i++) {
            tickets.put(categories[i], prices[i]);
        }
        return tickets;
    }
}
