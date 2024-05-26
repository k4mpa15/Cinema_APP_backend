package pl.wat.backend.model;

import java.time.LocalDateTime;

public class Movie {
    private String name;
    private LocalDateTime dateAdded;

    public Movie(String name, LocalDateTime dateAdded) {
        this.name = name;
        this.dateAdded = dateAdded;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDateTime getDateAdded() {
        return dateAdded;
    }

    public void setDateAdded(LocalDateTime dateAdded) {
        this.dateAdded = dateAdded;
    }
}
