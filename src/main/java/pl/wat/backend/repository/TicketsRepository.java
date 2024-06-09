package pl.wat.backend.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pl.wat.backend.model.Ticket;

@Repository
public interface TicketsRepository extends JpaRepository<Ticket, Long> {
}