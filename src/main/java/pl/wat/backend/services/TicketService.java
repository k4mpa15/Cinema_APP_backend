package pl.wat.backend.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import pl.wat.backend.entity.MovieHistory;
import pl.wat.backend.entity.Ticket;
import pl.wat.backend.entity.User;
import pl.wat.backend.repository.MovieHistoryRepository;
import pl.wat.backend.repository.ScreenRoom;
import pl.wat.backend.repository.TicketsRepository;
import pl.wat.backend.repository.UserRepository;

@Service
public class TicketService {

    @Autowired
    private TicketsRepository ticketRepository;

    @Autowired
    private MovieHistoryRepository movieHistoryRepository;
    @Autowired
    private ScreenRoom screenRoom;

    @Autowired
    private UserRepository userRepository;

    public TicketService() {
    }

    @Transactional
    public Ticket addTicket(Ticket ticket) {
        Ticket savedTicket = ticketRepository.save(ticket);
        addMovieHistory(savedTicket);
        addMovieToSala(savedTicket);
        return savedTicket;
    }

    private void addMovieToSala(Ticket savedTicket) {
        System.out.println(savedTicket.getSeatNumber());
        System.out.println(savedTicket.getMovie());
            pl.wat.backend.entity.ScreenRoom screenRoom = new pl.wat.backend.entity.ScreenRoom();
            screenRoom.setNrKrzeselka(savedTicket.getSeatNumber());
            screenRoom.setMovie(savedTicket.getMovie());

            this.screenRoom.save(screenRoom);
    }

    private void addMovieHistory(Ticket ticket) {
        String mail = ticket.getUser_mail();
        User user = userRepository.findByEmail(String.valueOf(mail));
        System.out.println(mail);
        if (user != null) {
            MovieHistory movieHistory = new MovieHistory();
            movieHistory.setEmail(String.valueOf(mail));
            movieHistory.setName(ticket.getMovie());
            movieHistory.setDateAdded(ticket.getPurchaseDate());
            movieHistoryRepository.save(movieHistory);
        }
    }
}
