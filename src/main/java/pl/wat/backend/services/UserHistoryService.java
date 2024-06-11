package pl.wat.backend.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pl.wat.backend.entity.MovieHistory;
import pl.wat.backend.repository.MovieHistoryRepository;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.time.LocalDateTime;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

@Service
public class UserHistoryService {

    @Autowired
    private MovieHistoryRepository movieHistoryRepository;

    public Map<String, Map<String, String>> getMovieHistory() {
        String email = readEmailFromFile();
        List<MovieHistory> movieHistoryList = movieHistoryRepository.findByEmail(email);
        Map<String, Map<String, String>> historyMap = new LinkedHashMap<>();

        for (int i = 0; i < movieHistoryList.size(); i++) {
            MovieHistory movieHistory = movieHistoryList.get(i);
            Map<String, String> movieDetails = new LinkedHashMap<>();
            movieDetails.put("email", movieHistory.getEmail());
            movieDetails.put("name", movieHistory.getName());
            movieDetails.put("dateAdded", movieHistory.getDateAdded().toString());
            historyMap.put(String.valueOf(i + 1), movieDetails);
        }

        return historyMap;
    }
    private String readEmailFromFile() {
        try (BufferedReader br = new BufferedReader(new FileReader("users.txt"))) {
            return br.readLine();
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }
    public void addMovie(String email, String movieName) {
        MovieHistory movieHistory = new MovieHistory();
        movieHistory.setEmail(email);
        movieHistory.setName(movieName);
        movieHistory.setDateAdded(LocalDateTime.now());
        movieHistoryRepository.save(movieHistory);
    }
}
