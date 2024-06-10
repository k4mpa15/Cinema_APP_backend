// RepertuarRepository.java
package pl.wat.backend.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pl.wat.backend.entity.Repertuar;

@Repository
public interface RepertuarRepository extends JpaRepository<Repertuar, Long> {
}
