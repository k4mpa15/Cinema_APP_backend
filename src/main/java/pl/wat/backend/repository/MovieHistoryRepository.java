package pl.wat.backend.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import pl.wat.backend.entity.MovieHistory;

import java.util.List;

public interface MovieHistoryRepository extends JpaRepository<MovieHistory, Long> {
    List<MovieHistory> findByEmail(String email);
}
