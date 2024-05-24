package pl.wat.backend.services;

import org.springframework.stereotype.Service;

import java.util.LinkedHashMap;
import java.util.Map;

@Service
public class BarService {

    private String[] snacks = {"popcorn", "nachos", "sok", "cola"};

    private String[] prices = {"15.00 zl", "20.00 zl", "5.00 zl", "6.00 zl"};

    public Map<String, String> generatePrices() {
        Map<String, String> menu = new LinkedHashMap<>();
        for (int i = 0; i < snacks.length; i++) {
            menu.put(snacks[i], prices[i]);
        }
        return menu;
    }
}
