package pl.wat.backend.model;

import java.time.LocalDateTime;

public class MovieRating {
    private String name;
    private int rating;
    private LocalDateTime dateAdded;

    public MovieRating(String name, int rating, LocalDateTime dateAdded) {
        this.name = name;
        this.rating = rating;
        this.dateAdded = dateAdded;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    public LocalDateTime getDateAdded() {
        return dateAdded;
    }

    public void setDateAdded(LocalDateTime dateAdded) {
        this.dateAdded = dateAdded;
    }
}
