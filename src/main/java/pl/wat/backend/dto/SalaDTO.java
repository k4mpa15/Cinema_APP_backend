package pl.wat.backend.dto;

import java.util.List;

public class SalaDTO {

    private int salaNumber;
    private List<Integer> seatNumbers;

    // Konstruktor dla danych związanych z miejscami
    public SalaDTO(int salaNumber, List<Integer> seatNumbers) {
        this.salaNumber = salaNumber;
        this.seatNumbers = seatNumbers;
    }

    // Gettery i Settery
    public int getSalaNumber() {
        return salaNumber;
    }

    public void setSalaNumber(int salaNumber) {
        this.salaNumber = salaNumber;
    }

    public List<Integer> getSeatNumbers() {
        return seatNumbers;
    }

    public void setSeatNumbers(List<Integer> seatNumbers) {
        this.seatNumbers = seatNumbers;
    }
}
