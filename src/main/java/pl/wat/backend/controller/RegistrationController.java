package pl.wat.backend.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import pl.wat.backend.services.UserService;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

@RestController
public class RegistrationController {

    @Autowired
    private UserService userService;

    @PostMapping("/register")
    public ResponseEntity<String> registerUser(
            @RequestParam String email,
            @RequestParam String password,
            @RequestParam String confirmPassword,
            @RequestParam String name,
            @RequestParam String surname,
            @RequestParam String phone
    ) {
        if (!password.equals(confirmPassword)) {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("Hasła nie pasują do siebie.");
        }

        if (!userService.registerUser(email, password, name, surname, phone)) {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("Taki mail już istnieje.");
        }
        saveEmailToFile(email);
        return ResponseEntity.status(HttpStatus.CREATED).body("Użytkownik zarejestrowany pomyślnie.");
    }

    private void saveEmailToFile(String email) {
        try (FileWriter fw = new FileWriter("users.txt", false);
             BufferedWriter bw = new BufferedWriter(fw);
             PrintWriter out = new PrintWriter(bw)) {
            out.println(email);
        } catch (IOException e) {
            System.err.println("Błąd podczas zapisywania emaila do pliku: " + e.getMessage());
        }
    }
}
