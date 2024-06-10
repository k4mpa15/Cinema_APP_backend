package pl.wat.backend.entity;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "Sala")
public class Sala {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "sala_id")
    private Long id;

    @Column(name = "sala_number")
    private int salaNumber;

    @OneToMany(mappedBy = "sala", cascade = CascadeType.ALL)
    private List<Seat> seats;

    // Getters and setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public int getSalaNumber() {
        return salaNumber;
    }

    public void setSalaNumber(int salaNumber) {
        this.salaNumber = salaNumber;
    }

    public List<Seat> getSeats() {
        return seats;
    }

    public void setSeats(List<Seat> seats) {
        this.seats = seats;
    }
}
