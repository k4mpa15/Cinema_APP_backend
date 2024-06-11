package pl.wat.backend.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import pl.wat.backend.services.UserHistoryService;

import java.util.Map;

@RestController
public class UserHistoryController {

    @Autowired
    private UserHistoryService userHistoryService;

    @GetMapping("/user/history")
    public Map<String, Map<String, String>> getUserHistory() {
        return userHistoryService.getMovieHistory();
    }

    @PostMapping("/user/history")
    public void addMovieToHistory(@RequestParam String email, @RequestParam String movie) {
        userHistoryService.addMovie(email, movie);
        System.out.println("Added movie: " + movie + " for email: " + email);
    }
}
