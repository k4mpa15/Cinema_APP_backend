package pl.wat.backend.services;

import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

@Service
public class UserRatingsService {

    private Map<String, Integer> movieRatings;

    public UserRatingsService() {
        movieRatings = new HashMap<>();
        // Przykładowe dane
        movieRatings.put("Incepcja", 5);
        movieRatings.put("Interstellar", 4);
        movieRatings.put("Matrix", 5);
        movieRatings.put("Avengers: Koniec gry", 4);
    }

    public Map<String, Integer> getMovieRatings() {
        return new HashMap<>(movieRatings);
    }

    public void addRating(String movie, int rating) {
        if (rating >= 1 && rating <= 5) {
            movieRatings.put(movie, rating);
        }
    }
}
