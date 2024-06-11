package pl.wat.backend.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pl.wat.backend.dto.SalaDTO;
import pl.wat.backend.entity.Sala;
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

    public List<SalaDTO> occupiedSeats(String movie) {
        List<Sala> zajeteMiejsca = salaRepository.findByMovie(movie);

        List<SalaDTO> zajeteMiejscaDTO = zajeteMiejsca.stream()
                .map(sala -> new SalaDTO(sala.getNrKrzeselka(), sala.getMovie()))
                .collect(Collectors.toList());

        return zajeteMiejscaDTO;
    }
}
