// GiftcardController.java
package pl.wat.backend.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import pl.wat.backend.services.GiftcardService;

import java.util.Map;

@RestController
public class GiftcardController {

    @Autowired
    private GiftcardService giftcardService;

    @GetMapping("/prices/giftcard")
    public Map<String, String> generateGiftcardPrices() {
        return giftcardService.generatePrices();
    }
}
