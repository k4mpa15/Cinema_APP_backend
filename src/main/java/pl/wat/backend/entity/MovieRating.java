package pl.wat.backend.entity;

import jakarta.persistence.*;
import java.time.LocalDateTime;

@Entity
public class MovieRating {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String email;
    private String name;
    private int rating;
    private LocalDateTime dateAdded;


    public MovieRating() {
    }

    public MovieRating(String email, String name, int rating, LocalDateTime dateAdded) {
        this.email = email;
        this.name = name;
        this.rating = rating;
        this.dateAdded = dateAdded;
    }

    public String getName() {
        return this.name;
    }

    public int getRating() {
        return this.rating;
    }

    public Object getDateAdded() {
        return this.dateAdded;
    }
}
