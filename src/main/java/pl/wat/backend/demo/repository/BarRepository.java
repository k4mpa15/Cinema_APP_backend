package pl.wat.backend.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pl.wat.backend.demo.entity.Bar;

@Repository
public interface BarRepository extends JpaRepository<Bar, Long> {
}
