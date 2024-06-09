package pl.wat.backend.dto;

public class SeatDTO {

    private int seatNumber;
    private boolean occupied;

    public SeatDTO(int seatNumber, boolean occupied) {
        this.seatNumber = seatNumber;
        this.occupied = occupied;
    }

    // Getters and setters
    public int getSeatNumber() {
        return seatNumber;
    }

    public void setSeatNumber(int seatNumber) {
        this.seatNumber = seatNumber;
    }

    public boolean isOccupied() {
        return occupied;
    }

    public void setOccupied(boolean occupied) {
        this.occupied = occupied;
    }
}