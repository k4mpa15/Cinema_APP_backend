package pl.wat.backend.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pl.wat.backend.entity.Sala;

@Repository
public interface SalaRepository extends JpaRepository<Sala, Long> {
}
