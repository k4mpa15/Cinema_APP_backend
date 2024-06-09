package pl.wat.backend.records;

public record Ticket(String userId, int seatNumber, String purchaseDate, String ticketType) {
}