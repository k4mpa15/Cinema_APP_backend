package pl.wat.backend.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RegistrationController {

    private String email;
    private String password;
    private String imie;
    private String nazwisko;


    @PostMapping("/register")
    public ResponseEntity<String> registerUser(
            @RequestParam String email,
            @RequestParam String password,
            @RequestParam String confirmPassword,
            @RequestParam String imie,
            @RequestParam String nazwisko
    ) {
        if (!password.equals(confirmPassword)) {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("Hasła nie pasują do siebie.");
        }
        //tu dodamy logike dodawania do bazy - na razie zapisuje to do zmiennych
        this.email = email;
        this.password = password;
        this.imie = imie;
        this.nazwisko = nazwisko;
        System.out.println("okok");
        return ResponseEntity.status(HttpStatus.CREATED).body("Użytkownik zarejestrowany pomyślnie.");
    }
}
