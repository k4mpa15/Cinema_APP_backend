package pl.wat.backend.controller;

import pl.wat.backend.dto.SeatDTO;
import pl.wat.backend.services.SeatService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class SeatController {

    private final SeatService seatService;

    @Autowired
    public SeatController(SeatService seatService) {
        this.seatService = seatService;
    }

    @GetMapping("/api/seats")
    public List<SeatDTO> getSeats() {
        return seatService.getAllSeats();
    }
}