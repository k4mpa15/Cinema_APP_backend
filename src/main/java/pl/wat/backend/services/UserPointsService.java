package pl.wat.backend.services;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

@Service
public class UserPointsService {

    private int points;

    public UserPointsService() {
        this.points = 0; // Początkowa liczba punktów
    }

    public String getPoints() {
        ObjectMapper objectMapper = new ObjectMapper();
        Map<String, String> response = new HashMap<>();
        response.put("punkty", String.valueOf(points));

        try {
            return objectMapper.writeValueAsString(response);
        } catch (JsonProcessingException e) {
            e.printStackTrace();
            return "{}";
        }
    }

    public void addPoints(int points) {
        if (points > 0) {
            this.points += points;
        }
    }

    public void resetPoints() {
        this.points = 0;
    }
}
