package pl.wat.backend.entity;
import jakarta.persistence.*;

@Entity
@Table(name = "Sala")
public class Sala {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "nr_krzeselka")
    private int nrKrzeselka;

    @Column(name = "movie")
    private String movie;

    // Konstruktory, gettery i settery

    public Sala() {
    }

    public Sala(int nrKrzeselka, String movie) {
        this.nrKrzeselka = nrKrzeselka;
        this.movie = movie;
    }

    // Gettery i settery

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public int getNrKrzeselka() {
        return nrKrzeselka;
    }

    public void setNrKrzeselka(int nrKrzeselka) {
        this.nrKrzeselka = nrKrzeselka;
    }

    public String getMovie() {
        return movie;
    }

    public void setMovie(String movie) {
        this.movie = movie;
    }
}
