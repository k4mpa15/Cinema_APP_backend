package pl.wat.backend.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
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
    public ResponseEntity<Object> getUserPoints() {
        int points = Integer.parseInt(userPointsService.getPoints());
        String pointsJson = "{\"points\": \"" + points + "\"}";
        return new ResponseEntity<>(pointsJson, HttpStatus.OK);
    }



    @PostMapping("/user/points/reset")
    public void resetUserPoints() {
        userPointsService.resetPoints();
        System.out.println("Points have been reset. Total points: " + userPointsService.getPoints());
    }
    @GetMapping("/user/points/add")
    public ResponseEntity<String> add10PointsToCurrentUser() {
        userPointsService.addPoints(10);
        return new ResponseEntity<>("Added 10 points to the current user", HttpStatus.OK);
    }
}