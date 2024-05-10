package pl.wat.backend.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import pl.wat.backend.services.GreetingService;
import pl.wat.backend.services.GiftcardService;

import java.util.Map;

@RestController
public class PricesController {

    @Autowired
    private GreetingService greetingService;

    @GetMapping("/prices/giftcard")
    public Map<String, String> giftcard() {
        System.out.println(GiftcardService.generatePrices());
        return GiftcardService.generatePrices();
    }
}
