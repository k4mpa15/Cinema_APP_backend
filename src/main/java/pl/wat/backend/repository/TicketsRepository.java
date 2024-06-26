package pl.wat.backend.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pl.wat.backend.entity.Ticket;

@Repository
public interface TicketsRepository extends JpaRepository<Ticket, Long> {
}