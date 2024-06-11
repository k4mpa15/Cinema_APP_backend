package pl.wat.backend.entity;

import jakarta.persistence.*;
import java.time.LocalDateTime;

@Entity
public class MovieHistory {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String email;
    private String name;
    private LocalDateTime dateAdded;


    public MovieHistory() {
    }

    public MovieHistory(String email, String name, LocalDateTime dateAdded) {
        this.email = email;
        this.name = name;
        this.dateAdded = dateAdded;
    }

    public String getName() {
        return this.name;
    }


    public Object getDateAdded() {
        return this.dateAdded;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDateAdded(LocalDateTime now) {
        this.dateAdded = now;
    }

    public String getEmail() {
        return this.email;
    }
}
