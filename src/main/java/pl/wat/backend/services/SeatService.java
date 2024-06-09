package pl.wat.backend.services;

import pl.wat.backend.dto.SeatDTO;
import pl.wat.backend.entity.Seat;
import pl.wat.backend.repository.SeatRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class SeatService {

    private final SeatRepository seatRepository;

    @Autowired
    public SeatService(SeatRepository seatRepository) {
        this.seatRepository = seatRepository;
    }

    public List<SeatDTO> getAllSeats() {
        List<Seat> seats = seatRepository.findAll();
        return seats.stream()
                .map(seat -> new SeatDTO(seat.getSeatNumber(), seat.isOccupied()))
                .collect(Collectors.toList());
    }
}