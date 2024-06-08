package pl.wat.backend.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import pl.wat.backend.services.UserService;

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

        return ResponseEntity.status(HttpStatus.CREATED).body("Użytkownik zarejestrowany pomyślnie.");
    }
}
