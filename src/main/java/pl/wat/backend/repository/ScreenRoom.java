package pl.wat.backend.repository;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ScreenRoom extends JpaRepository<pl.wat.backend.entity.ScreenRoom, Long> {
    List<pl.wat.backend.entity.ScreenRoom> findByMovie(String movie);
}
