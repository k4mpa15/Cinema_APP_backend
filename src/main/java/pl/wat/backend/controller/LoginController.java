package pl.wat.backend.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import pl.wat.backend.entity.User;
import pl.wat.backend.repository.UserRepository;
import pl.wat.backend.security.JwtUtil;
import pl.wat.backend.services.UserService;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

@RestController
public class LoginController {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private UserService userService;

    @CrossOrigin(origins = "*")
    @PostMapping("/login")
    public ResponseEntity<String> loginUser(@RequestParam String username, @RequestParam String password) {
        User user = userRepository.findByEmail(username);

        if (user == null) {
            return ResponseEntity.status(HttpStatus.UNAUTHORIZED).body("Nieprawidłowy login lub hasło.");
        }

        String hashedPassword = userService.hashPassword(password);

        if (user.getPassword().equals(hashedPassword)) {
            String token = JwtUtil.generateToken(username);
            saveEmailToFile(username);
            return ResponseEntity.ok("Zalogowano pomyślnie.");
        } else {
            return ResponseEntity.status(HttpStatus.UNAUTHORIZED).body("Nieprawidłowy login lub hasło.");
        }
    }

    private void saveEmailToFile(String email) {
        try (FileWriter fw = new FileWriter("users.txt");
             BufferedWriter bw = new BufferedWriter(fw);
             PrintWriter out = new PrintWriter(bw)) {
            out.println(email);
        } catch (IOException e) {
            System.err.println("Błąd podczas zapisywania emaila do pliku: " + e.getMessage());
        }
    }

}
