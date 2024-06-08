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

@RestController
public class LoginController {

    @Autowired
    private UserRepository userRepository;

    @CrossOrigin(origins = "*")
    @PostMapping("/login")
    public ResponseEntity<String> loginUser(@RequestParam String username, @RequestParam String password) {
        User user = userRepository.findByEmail(username);
        if (user != null && user.getPassword().equals(password)) {
            String token = JwtUtil.generateToken(username);
            System.out.println("okok");
            System.out.println(token);
            return ResponseEntity.ok("Zalogowano pomyślnie.");
        } else {
            System.out.println("slabiutko");
            return ResponseEntity.status(HttpStatus.UNAUTHORIZED).body("Nieprawidłowy login lub hasło.");
        }
    }
}
