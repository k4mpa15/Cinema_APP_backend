package pl.wat.backend.dto;

import java.util.List;

public class ScreenRoomDTO {

    private int SeatNumber;
    private String movie;

    public ScreenRoomDTO(int salaNumber, String seatNumbers) {
        this.SeatNumber = salaNumber;
        this.movie = seatNumbers;
    }

    // Gettery i Settery
    public int getSeatNumber() {
        return SeatNumber;
    }

    public void setSeatNumber(int SeatNumber) {
        this.SeatNumber = SeatNumber;
    }

    public String getmovie() {
        return movie;
    }

    public void setmovie(List<Integer> movie) {
        this.movie = movie.toString();
    }
}
