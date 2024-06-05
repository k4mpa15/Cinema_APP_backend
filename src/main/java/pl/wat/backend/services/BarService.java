package pl.wat.backend.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pl.wat.backend.entity.Bar;
import pl.wat.backend.repository.BarRepository;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

@Service
public class BarService {

    @Autowired
    private BarRepository barRepository;

    public Map<String, Double> generatePricesFromDatabase() {
        List<Bar> bars = barRepository.findAll();
        for (Bar bar : bars) {
            System.out.println("Nazwa przedmiotu: " + bar.getItemName() + ", Cena: " + bar.getPrice());
        }
        Map<String, Double> menu = new LinkedHashMap<>();

        for (Bar bar : bars) {
            menu.put(bar.getItemName(), bar.getPrice());
        }
        return menu;
    }
}
