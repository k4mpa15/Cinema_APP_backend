package pl.wat.backend.services;

import org.springframework.stereotype.Service;
import pl.wat.backend.model.Movie;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

@Service
public class UserHistoryService {

    private List<Movie> movieHistory;

    public UserHistoryService() {
        movieHistory = new ArrayList<>();
        movieHistory.add(new Movie("Incepcja", LocalDateTime.now()));
        movieHistory.add(new Movie("Interstellar", LocalDateTime.now()));
        movieHistory.add(new Movie("Matrix", LocalDateTime.now()));
        movieHistory.add(new Movie("Avengers: Koniec gry", LocalDateTime.now()));
    }

    public Map<String, Map<String, String>> getMovieHistory() {
        Map<String, Map<String, String>> historyMap = new LinkedHashMap<>();
        for (int i = 0; i < movieHistory.size(); i++) {
            Map<String, String> movieDetails = new LinkedHashMap<>();
            movieDetails.put("nazwa", movieHistory.get(i).getName());
            movieDetails.put("data dodania", movieHistory.get(i).getDateAdded().toString());
            historyMap.put(String.valueOf(i + 1), movieDetails);
        }
        return historyMap;
    }

    public void addMovie(String movie) {
        movieHistory.add(new Movie(movie, LocalDateTime.now()));
    }
}
