// BiletyService.java
package pl.wat.backend.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pl.wat.backend.entity.Bilety;
import pl.wat.backend.repository.BiletyRepository;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

@Service
public class BiletyService {

    @Autowired
    private BiletyRepository biletyRepository;

    public Map<String, Double> generatePrices() {
        List<Bilety> biletyList = biletyRepository.findAll();
        Map<String, Double> ticketPrices = new LinkedHashMap<>();
        for (Bilety bilety : biletyList) {
            ticketPrices.put(bilety.getTicketType(), bilety.getPrice());
        }
        return ticketPrices;
    }
}
