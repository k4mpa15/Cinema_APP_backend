package pl.wat.backend.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pl.wat.backend.entity.Bilety;

@Repository
public interface BiletyRepository extends JpaRepository<Bilety, Long> {
}