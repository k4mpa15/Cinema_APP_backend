package pl.wat.backend.services;

import org.springframework.stereotype.Service;

import java.util.LinkedHashMap;
import java.util.Map;

@Service
public class TicketService {

    private String[] categories = {"Normalny", "Ulgowy", "Dla seniora", "Dziecięcy"};

    private String[] prices = {"30.00 zł", "20.00 zł", "25.00 zł", "15.00 zł"};

    public Map<String, String> generatePrices() {
        Map<String, String> tickets = new LinkedHashMap<>();
        for (int i = 0; i < categories.length; i++) {
            tickets.put(categories[i], prices[i]);
        }
        return tickets;
    }
}
