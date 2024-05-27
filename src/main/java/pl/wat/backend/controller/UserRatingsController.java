package pl.wat.backend.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import pl.wat.backend.services.UserRatingsService;

import java.util.Map;

@RestController
public class UserRatingsController {

    @Autowired
    private UserRatingsService userRatingsService;

    @GetMapping("/user/ratings")
    public Map<String, Map<String, String>> getUserRatings() {
        System.out.println(userRatingsService.getMovieRatings());
        return userRatingsService.getMovieRatings();
    }

    @PostMapping("/user/ratings")
    public void addUserRating(@RequestParam String movie, @RequestParam int rating) {
        userRatingsService.addRating(movie, rating);
        System.out.println("Added rating: " + rating + " for movie: " + movie);
    }
}