package pl.wat.backend.services;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserHistoryService {

    private List<String> movieHistory;

    public UserHistoryService() {
        movieHistory = new ArrayList<>();
        movieHistory.add("Incepcja");
        movieHistory.add("Interstellar");
        movieHistory.add("Matrix");
        movieHistory.add("Avengers: Koniec gry");
    }

    public List<String> getMovieHistory() {
        return new ArrayList<>(movieHistory);
    }

    public void addMovie(String movie) {
        movieHistory.add(movie);
    }
}