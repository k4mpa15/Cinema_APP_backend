package pl.wat.backend.services;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pl.wat.backend.entity.User;
import pl.wat.backend.repository.UserRepository;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

@Service
public class UserPointsService {

    private UserRepository userRepository;
    private int points;

    @Autowired
    public UserPointsService(UserRepository userRepository) {
        this.userRepository = userRepository;
        this.points = 0;
    }

    public String getPoints() {
        String email = readEmailFromFile();
        if (email == null) {
            return "{}";
        }

        User user = userRepository.findByEmail(email);
        if (user == null) {
            return "{}";
        }

        return String.valueOf(user.getPoints());
    }

    public void addPoints(int pointsToAdd) {
        String email = readEmailFromFile();
        if (email != null) {
            User user = userRepository.findByEmail(email);
            if (user != null) {

                user.addPoints(pointsToAdd);
                userRepository.save(user);
            }
        }
    }

    public void resetPoints() {
        String email = readEmailFromFile();
        if (email != null) {
            User user = userRepository.findByEmail(email);
            if (user != null) {
                user.addPoints(0);
                userRepository.save(user);
            }
        }
    }

    private String readEmailFromFile() {
        try (BufferedReader br = new BufferedReader(new FileReader("users.txt"))) {
            return br.readLine();
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }
}
