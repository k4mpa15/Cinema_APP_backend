package pl.wat.backend.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pl.wat.backend.dto.ScreenRoomDTO;
import pl.wat.backend.repository.ScreenRoom;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class ScreenRoomService {

    private final ScreenRoom screenRoom;

    @Autowired
    public ScreenRoomService(ScreenRoom screenRoom) {
        this.screenRoom = screenRoom;
    }

    public List<ScreenRoomDTO> occupiedSeats(String movie) {
        List<pl.wat.backend.entity.ScreenRoom> zajeteMiejsca = screenRoom.findByMovie(movie);

        List<ScreenRoomDTO> zajeteMiejscaDTO = zajeteMiejsca.stream()
                .map(screenRoom -> new ScreenRoomDTO(screenRoom.getNrKrzeselka(), screenRoom.getMovie()))
                .collect(Collectors.toList());

        return zajeteMiejscaDTO;
    }
}
