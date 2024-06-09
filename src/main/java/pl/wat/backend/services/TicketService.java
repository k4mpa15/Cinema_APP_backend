package pl.wat.backend.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pl.wat.backend.model.Bilety;
import pl.wat.backend.repository.BiletyRepository;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class TicketService {

    @Autowired
    private BiletyRepository biletyRepository;

    public Map<String, Double> getTicketPrices() {
        List<Bilety> biletyList = biletyRepository.findAll();
        Map<String, Double> ticketPrices = new HashMap<>();
        for (Bilety bilety : biletyList) {
            ticketPrices.put(bilety.getTicketType(), bilety.getPrice());
        }
        return ticketPrices;
    }
}
