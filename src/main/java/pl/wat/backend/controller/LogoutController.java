package pl.wat.backend.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import jakarta.servlet.http.HttpSession;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

@RestController
public class LogoutController {

    @PostMapping("/logout")
    public String logoutUser() {
        removeAllEmailsFromFile();

        return "Wylogowano pomyślnie.";
    }
    private void removeAllEmailsFromFile() {
        try (FileWriter fw = new FileWriter("users.txt", false);
             BufferedWriter bw = new BufferedWriter(fw);
             PrintWriter out = new PrintWriter(bw)) {
            out.print("");
        } catch (IOException e) {
            System.err.println("Błąd podczas usuwania zawartości pliku: " + e.getMessage());
        }
    }

}
