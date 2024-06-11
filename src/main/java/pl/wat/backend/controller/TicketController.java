package pl.wat.backend.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import pl.wat.backend.entity.Ticket;
import pl.wat.backend.services.TicketService;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.time.LocalDateTime;
import java.util.Map;

@RestController
@RequestMapping("/tickets")
public class TicketController {

    @Autowired
    private TicketService ticketService;

    @PostMapping("/add")
    public ResponseEntity<String> addTicket(@RequestBody Map<String, String> ticketDetails) {
        System.out.println(ticketDetails.get("movie"));
        System.out.println(ticketDetails.get("ticketType"));
        String movie = ticketDetails.get("movie");
        String email = readEmailFromFile();
        int seatNumber = Integer.parseInt(ticketDetails.get("seatNumber"));
        String ticketType = ticketDetails.get("ticketType");

        Ticket ticket = new Ticket();
        ticket.setUser_mail(email);
        ticket.setPurchaseDate(LocalDateTime.now());
        ticket.setMovie(movie);
        ticket.setSeatNumber(seatNumber);
        ticket.setTicketType(ticketType);

        ticketService.addTicket(ticket);
        return new ResponseEntity<>("Ticket added successfully", HttpStatus.CREATED);
    }
    private String readEmailFromFile() {
        try (BufferedReader br = new BufferedReader(new FileReader("users.txt"))) {
            return br.readLine();
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }
}
