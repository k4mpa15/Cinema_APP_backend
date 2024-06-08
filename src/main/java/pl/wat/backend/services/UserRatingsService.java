package pl.wat.backend.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pl.wat.backend.entity.MovieRating;
import pl.wat.backend.repository.MovieRatingRepository;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.time.LocalDateTime;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

@Service
public class UserRatingsService {

    @Autowired
    private MovieRatingRepository movieRatingRepository;

    public Map<String, Object> getMovieRatings() {
        String email = readEmailFromFile();
        if (email == null) {
            return Map.of("error", "Nie znaleziono użytkownika.");
        }

        List<MovieRating> movieRatings = movieRatingRepository.findByEmail(email);
        if (movieRatings.isEmpty()) {
            return Map.of("ratings", "");
        }

        Map<String, Map<String, String>> ratingsMap = new LinkedHashMap<>();
        for (int i = 0; i < movieRatings.size(); i++) {
            Map<String, String> ratingDetails = new LinkedHashMap<>();
            ratingDetails.put("nazwa", movieRatings.get(i).getName());
            ratingDetails.put("ocena", String.valueOf(movieRatings.get(i).getRating()));
            ratingDetails.put("data", movieRatings.get(i).getDateAdded().toString());
            ratingsMap.put(String.valueOf(i + 1), ratingDetails);
        }
        return Map.of("ratings", ratingsMap);
    }

    public void addRating(String movie, int rating) {
        String email = readEmailFromFile();
        if (email != null && rating >= 1 && rating <= 5) {
            movieRatingRepository.save(new MovieRating(email, movie, rating, LocalDateTime.now()));
        }
    }

    private String readEmailFromFile() {
        try (BufferedReader br = new BufferedReader(new FileReader("users.txt"))) {
            return br.readLine();
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }
}
