package pl.wat.backend.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import pl.wat.backend.services.UserHistoryService;

import java.util.List;
import java.util.Map;

@RestController
public class UserHistoryController {

    @Autowired
    private UserHistoryService userHistoryService;

    @GetMapping("/user/history")
    public Map<String, String> getUserHistory() {
        System.out.println(userHistoryService.getMovieHistory());
        return userHistoryService.getMovieHistory();
    }

    @PostMapping("/user/history")
    public void addMovieToHistory(@RequestParam String movie) {
        userHistoryService.addMovie(movie);
        System.out.println("Added movie: " + movie);
    }
}