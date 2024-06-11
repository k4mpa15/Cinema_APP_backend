// GiftcardService.java
package pl.wat.backend.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pl.wat.backend.entity.Giftcard;
import pl.wat.backend.repository.GiftcardRepository;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

@Service
public class GiftcardService {

    @Autowired
    private GiftcardRepository giftcardRepository;

    public Map<String, Double> generatePrices() {
        List<Giftcard> giftcardList = giftcardRepository.findAll();
        Map<String, Double> giftcardPrices = new LinkedHashMap<>();
        for (Giftcard giftcard : giftcardList) {
            giftcardPrices.put(giftcard.getGiftcardType(), giftcard.getPrice());
        }
        return giftcardPrices;
    }
}
