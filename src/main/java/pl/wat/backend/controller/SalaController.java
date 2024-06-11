package pl.wat.backend.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import pl.wat.backend.dto.SalaDTO;
import pl.wat.backend.services.SalaService;

import java.util.List;

@RestController
public class SalaController {

    private final SalaService salaService;

    @Autowired
    public SalaController(SalaService salaService) {
        this.salaService = salaService;
    }

    @GetMapping("/sale")
    public List<SalaDTO> getZajeteMiejsca(@RequestParam String movie) {
        return salaService.occupiedSeats(movie);
    }
}
