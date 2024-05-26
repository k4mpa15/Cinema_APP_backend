package pl.wat.backend.services;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

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

    public Map<String, String> getMovieHistory() {
        Map<String, String> historyMap = new LinkedHashMap<>();
        for (int i = 0; i < movieHistory.size(); i++) {
            historyMap.put(String.valueOf(i + 1), movieHistory.get(i));
        }
        return historyMap;
    }

    public void addMovie(String movie) {
        movieHistory.add(movie);
    }
}
