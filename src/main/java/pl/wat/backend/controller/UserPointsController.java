package pl.wat.backend.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import pl.wat.backend.services.UserPointsService;

@RestController
public class UserPointsController {

    @Autowired
    private UserPointsService userPointsService;

    @GetMapping("/user/points")
    public String getUserPoints() {
        String pointsJson = userPointsService.getPoints();
        System.out.println("Current points: " + pointsJson);
        return pointsJson;
    }

    @PostMapping("/user/points/add")
    public void addUserPoints(@RequestParam int points) {
        userPointsService.addPoints(points);
        System.out.println("Added points: " + points + ", Total points: " + userPointsService.getPoints());
    }

    @PostMapping("/user/points/reset")
    public void resetUserPoints() {
        userPointsService.resetPoints();
        System.out.println("Points have been reset. Total points: " + userPointsService.getPoints());
    }
}