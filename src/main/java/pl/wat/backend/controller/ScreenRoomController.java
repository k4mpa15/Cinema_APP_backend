package pl.wat.backend.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import pl.wat.backend.dto.ScreenRoomDTO;
import pl.wat.backend.services.ScreenRoomService;

import java.util.List;

@RestController
public class ScreenRoomController {

    private final ScreenRoomService screenRoomService;

    @Autowired
    public ScreenRoomController(ScreenRoomService screenRoomService) {
        this.screenRoomService = screenRoomService;
    }

    @GetMapping("/sale")
    public List<ScreenRoomDTO> getZajeteMiejsca(@RequestParam String movie) {
        return screenRoomService.occupiedSeats(movie);
    }
}
