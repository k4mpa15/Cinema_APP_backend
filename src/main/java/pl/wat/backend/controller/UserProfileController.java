package pl.wat.backend.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import pl.wat.backend.services.UserProfileService;

import java.util.Map;

@RestController
public class UserProfileController {

    @Autowired
    private UserProfileService userProfileService;

    @GetMapping("/user/profile")
    public Map<String, Object> getUserProfile() {
        System.out.println(userProfileService.getUserProfile());
        return userProfileService.getUserProfile();
    }
}