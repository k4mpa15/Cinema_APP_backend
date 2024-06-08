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
    public String logoutUser(@RequestParam String token) {

        System.out.println("token: " + token);
        tokenService.invalidateToken(token);
        return "Wylogowano pomyślnie.";
    }
}
