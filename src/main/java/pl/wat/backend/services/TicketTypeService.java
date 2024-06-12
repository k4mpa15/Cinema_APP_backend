// BiletyService.java
package pl.wat.backend.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pl.wat.backend.entity.TicketType;
import pl.wat.backend.repository.TicketTypeRepository;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

@Service
public class TicketTypeService {

    @Autowired
    private TicketTypeRepository ticketTypeRepository
;

    public Map<String, Double> generatePrices() {
        List<TicketType> ticketTypeList = ticketTypeRepository
.findAll();
        Map<String, Double> ticketPrices = new LinkedHashMap<>();
        for (TicketType ticketType : ticketTypeList) {
            ticketPrices.put(ticketType.getTicketType(), ticketType.getPrice());
        }
        return ticketPrices;
    }
}
