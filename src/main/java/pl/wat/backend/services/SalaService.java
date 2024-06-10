package pl.wat.backend.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pl.wat.backend.dto.SalaDTO;
import pl.wat.backend.entity.Sala;
import pl.wat.backend.entity.Seat;
import pl.wat.backend.repository.SalaRepository;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class SalaService {

    private final SalaRepository salaRepository;

    @Autowired
    public SalaService(SalaRepository salaRepository) {
        this.salaRepository = salaRepository;
    }

    public List<SalaDTO> getAllSalas() {
        List<Sala> salas = salaRepository.findAll();
        return salas.stream()
                .map(sala -> new SalaDTO(sala.getSalaNumber(), sala.getSeats().stream().map(Seat::getSeatNumber).collect(Collectors.toList())))
                .collect(Collectors.toList());
    }
}
