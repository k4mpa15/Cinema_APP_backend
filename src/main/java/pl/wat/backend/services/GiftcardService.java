package pl.wat.backend.services;

import org.springframework.stereotype.Service;

import java.util.LinkedHashMap;
import java.util.Map;


@Service
public class GiftcardService {

    private static String[] names = {"Standardowa", "VIP", "Dla dzieci", "Dla seniorow" };

    private static String[] prices = {"50.00 zl", "100.00 zl", "25.00 zl", "30.00 zl"};


    public static Map<String, String> generatePrices() {
        Map<String, String> Giftcard = new LinkedHashMap<>();
        for (int i = 0; i < 4; i++) {
            Giftcard.put(names[i], prices[i]);
        }
        return Giftcard;
    }

}
