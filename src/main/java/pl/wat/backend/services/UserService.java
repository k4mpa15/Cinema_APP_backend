package pl.wat.backend.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pl.wat.backend.entity.User;
import pl.wat.backend.repository.UserRepository;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.HashMap;
import java.util.Map;
import jakarta.servlet.http.HttpSession;


@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public boolean registerUser(String email, String password, String name, String surname, String phone) {
        if (userRepository.findByEmail(email) != null) {
            return false;
        }

        String hashedPassword = hashPassword(password);

        User user = new User();
        user.setEmail(email);
        user.setPasswordHash(hashedPassword);
        user.setName(name);
        user.setSurname(surname);
        user.setPhone(phone);
        user.setPoints();

        userRepository.save(user);
        return true;
    }

    public String hashPassword(String password) {
        try {
            MessageDigest digest = MessageDigest.getInstance("SHA-256");
            byte[] encodedhash = digest.digest(password.getBytes());
            return bytesToHex(encodedhash);
        } catch (NoSuchAlgorithmException e) {
            throw new RuntimeException(e);
        }
    }

    private String bytesToHex(byte[] hash) {
        StringBuilder hexString = new StringBuilder();
        for (byte b : hash) {
            String hex = Integer.toHexString(0xff & b);
            if (hex.length() == 1) hexString.append('0');
            hexString.append(hex);
        }
        return hexString.toString();
    }
    public Map<String, Object> getUserProfile() {
        String email = readEmailFromFile();
        if (email == null) {
            return null;
        }

        User user = userRepository.findByEmail(email);
        if (user == null) {
            return null;
        }

        Map<String, Object> userProfile = new HashMap<>();
        userProfile.put("name", user.getName());
        userProfile.put("email", user.getEmail());
        userProfile.put("surname", user.getSurname());
        userProfile.put("phone", user.getPhone());
        return userProfile;
    }

    private String readEmailFromFile() {
        try (BufferedReader br = new BufferedReader(new FileReader("users.txt"))) {
            return br.readLine();
        } catch (IOException e) {
            System.err.println("Błąd podczas odczytu pliku: " + e.getMessage());
            return null;
        }
    }
}
