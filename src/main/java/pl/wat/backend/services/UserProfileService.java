package pl.wat.backend.services;

import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

@Service
public class UserProfileService {

    private String userName = "Jan Kowalski";
    private String email = "jan.kowalski@example.com";
    private int age = 30;

    public Map<String, Object> getUserProfile() {
        Map<String, Object> userProfile = new HashMap<>();
        userProfile.put("name", userName);
        userProfile.put("email", email);
        userProfile.put("age", age);
        return userProfile;
    }
}