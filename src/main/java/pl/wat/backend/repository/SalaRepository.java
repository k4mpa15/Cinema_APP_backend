package pl.wat.backend.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import pl.wat.backend.entity.Sala;

import java.util.List;

public interface SalaRepository extends JpaRepository<Sala, Long> {
    List<Sala> findByMovie(String movie);
}
