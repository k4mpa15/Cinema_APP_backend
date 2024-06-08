package pl.wat.backend.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import pl.wat.backend.entity.MovieRating;

import java.util.List;

public interface MovieRatingRepository extends JpaRepository<MovieRating, Long> {
    List<MovieRating> findByEmail(String email);
}
