package pl.wat.backend.demo.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import pl.wat.backend.demo.entity.Bar;

public interface BarRepository extends JpaRepository<Bar, Long> {
}
