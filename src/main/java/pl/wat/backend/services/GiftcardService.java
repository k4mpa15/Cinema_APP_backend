package pl.wat.backend.services;

import org.springframework.stereotype.Service;

import java.util.LinkedHashMap;
import java.util.Map;


@Service
public class GiftcardService {

    private static String[] names = {"Standardowa", "VIP", "Dla dzieci", "Dla seniorów" };

    private static String[] prices = {"50.00 zł", "100.00 zł", "25.00 zł", "30.00 zł"};


    public static Map<String, String> generatePrices() {
        Map<String, String> Giftcard = new LinkedHashMap<>();
        for (int i = 0; i < 4; i++) {
            Giftcard.put(names[i], prices[i]);
        }
        return Giftcard;
    }

}
