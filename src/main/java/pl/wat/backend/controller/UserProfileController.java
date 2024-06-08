package pl.wat.backend.controller;

import jakarta.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import pl.wat.backend.services.UserService;

import java.util.Map;

@RestController
public class UserProfileController {

    @Autowired
    private UserService userService;

    @GetMapping("/user/profile")
    public ResponseEntity<Map<String, Object>> getUserProfile() {
        Map<String, Object> userProfile = userService.getUserProfile();
        if (userProfile == null) {
            return ResponseEntity.status(HttpStatus.UNAUTHORIZED).body(null);
        }
        return ResponseEntity.ok(userProfile);
    }
}