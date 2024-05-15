package pl.wat.backend.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import pl.wat.backend.services.TokenService;

@RestController
public class LogoutController {

    @Autowired
    private TokenService tokenService;

    @PostMapping("/logout")
    public String logout(@RequestParam String token) {

        if (token.startsWith("Bearer ")) {
            token = token.substring(7);
        }

        System.out.println("token: " + token);
        tokenService.invalidateToken(token);
        return "Wylogowano pomyślnie.";
    }
}
