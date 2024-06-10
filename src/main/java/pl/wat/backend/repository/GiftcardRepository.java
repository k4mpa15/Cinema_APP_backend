// GiftcardRepository.java
package pl.wat.backend.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pl.wat.backend.entity.Giftcard;

@Repository
public interface GiftcardRepository extends JpaRepository<Giftcard, Long> {
}
