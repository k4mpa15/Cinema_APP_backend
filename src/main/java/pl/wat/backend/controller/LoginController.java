package pl.wat.backend.controller;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import pl.wat.backend.security.JwtUtil;

@RestController
public class LoginController {

    private final String correctUsername = "jan.kowalski@example.com";
    private final String correctPassword = "haslomaslo";
    @CrossOrigin(origins = "*")
    @PostMapping("/login")
    public ResponseEntity<String> loginUSer(@RequestParam String username, @RequestParam String password) {
        if (username.equals(correctUsername) && password.equals(correctPassword)) {
            String token = JwtUtil.generateToken(username);
            System.out.println("okok"); //dodamy tu sprawdzenie z baza - na razie sprawdzam zmienne na sztywno
            System.out.println(token);
            return ResponseEntity.ok("Zalogowano pomyślnie.");
        } else {
            System.out.println("slabiutko");
            return ResponseEntity.status(HttpStatus.UNAUTHORIZED).body("Nieprawidłowy login lub hasło.");

        }
    }
}

