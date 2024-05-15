package pl.wat.backend.services;

import org.springframework.stereotype.Service;

@Service
public class UserPointsService {

    private int points;

    public UserPointsService() {
        this.points = 0; // Początkowa liczba punktów
    }

    public int getPoints() {
        return points;
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