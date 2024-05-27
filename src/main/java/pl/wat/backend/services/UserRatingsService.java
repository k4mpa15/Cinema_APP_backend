package pl.wat.backend.services;

import org.springframework.stereotype.Service;
import pl.wat.backend.model.MovieRating;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

@Service
public class UserRatingsService {

    private List<MovieRating> movieRatings;

    public UserRatingsService() {
        movieRatings = new ArrayList<>();
        movieRatings.add(new MovieRating("Incepcja", 5, LocalDateTime.now()));
        movieRatings.add(new MovieRating("Interstellar", 4, LocalDateTime.now()));
        movieRatings.add(new MovieRating("Matrix", 5, LocalDateTime.now()));
        movieRatings.add(new MovieRating("Avengers: Koniec gry", 4, LocalDateTime.now()));
    }

    public Map<String, Map<String, String>> getMovieRatings() {
        Map<String, Map<String, String>> ratingsMap = new LinkedHashMap<>();
        for (int i = 0; i < movieRatings.size(); i++) {
            Map<String, String> ratingDetails = new LinkedHashMap<>();
            ratingDetails.put("name", movieRatings.get(i).getName());
            ratingDetails.put("rating", String.valueOf(movieRatings.get(i).getRating()));
            ratingDetails.put("dateAdded", movieRatings.get(i).getDateAdded().toString());
            ratingsMap.put(String.valueOf(i + 1), ratingDetails);
        }
        return ratingsMap;
    }

    public void addRating(String movie, int rating) {
        if (rating >= 1 && rating <= 5) {
            movieRatings.add(new MovieRating(movie, rating, LocalDateTime.now()));
        }
    }
}
