-- Wstawianie do tabeli bar
INSERT INTO bar (item_name, price) VALUES ('Popcorn', 5.50);
INSERT INTO bar (item_name, price) VALUES ('Nachos', 12.00);
INSERT INTO bar (item_name, price) VALUES ('Cola', 100.00);
INSERT INTO bar (item_name, price) VALUES ('Sok', 10.00);

-- Wstawianie do tabeli Users
INSERT INTO Users (email, name, surname, password_hash, phone, points) VALUES
('john.doe@example.com', 'John', 'Doe', '0dee3eaf26a48e6447042f7beb357e9780452bb85eebb3f550fe32a775779865', '123456789', 40),
('jane.smith@example.com', 'Jane', 'Smith', '0dee3eaf26a48e6447042f7beb357e9780452bb85eebb3f550fe32a775779865', '987654321', 20),
('michael.jones@example.com', 'Michael', 'Jones', '0dee3eaf26a48e6447042f7beb357e9780452bb85eebb3f550fe32a775779865', '555666777', 0),
('emily.davis@example.com', 'Emily', 'Davis', '0dee3eaf26a48e6447042f7beb357e9780452bb85eebb3f550fe32a775779865', '444555666', 40),
('daniel.brown@example.com', 'Daniel', 'Brown', '0dee3eaf26a48e6447042f7beb357e9780452bb85eebb3f550fe32a775779865', '333444555', 50),
('jan.kowalski@example.com', 'Jan', 'Kowalski', '0dee3eaf26a48e6447042f7beb357e9780452bb85eebb3f550fe32a775779865', '345654345', 10);

-- Wstawianie do tabeli MovieRating
INSERT INTO MovieRating (email, name, rating, date_added) VALUES
('john.doe@example.com', 'Incepcja', 5, CURRENT_TIMESTAMP),
('john.doe@example.com', 'Interstellar', 4, CURRENT_TIMESTAMP),
('jane.smith@example.com', 'Matrix', 5, CURRENT_TIMESTAMP),
('jane.smith@example.com', 'Avengers: Koniec gry', 4, CURRENT_TIMESTAMP);

-- Wstawianie do tabeli MovieHistory
INSERT INTO MovieHistory (email, name, date_added) VALUES
('john.doe@example.com', 'Incepcja',  CURRENT_TIMESTAMP),
('john.doe@example.com', 'Interstellar', CURRENT_TIMESTAMP),
('jane.smith@example.com', 'Matrix',  CURRENT_TIMESTAMP),
('jane.smith@example.com', 'Avengers: Koniec gry', CURRENT_TIMESTAMP);

-- Wstawianie do tabeli Sala
INSERT INTO Sala (user_id, nr_krzeselka, data, godzina, zajete) VALUES 
(1, 1, '2024-06-09', '15:00:00', TRUE),
(2, 2, '2024-06-09', '17:00:00', FALSE),
(3, 3, '2024-06-09', '19:00:00', TRUE),
(4, 4, '2024-06-09', '21:00:00', FALSE);

-- Wstawianie do tabeli Tickets
INSERT INTO Tickets (user_id, seat_number, purchase_date, ticket_type) VALUES 
(1, 1, '2024-06-09 14:00:00', 'Normalny'),
(2, 2, '2024-06-09 15:30:00', 'Ulgowy'),
(3, 3, '2024-06-09 17:00:00', 'Grupowy'),
(4, 4, '2024-06-09 18:30:00', 'Studencki');

-- Wstawianie do tabeli Repertuar
INSERT INTO Repertuar (movie_name, show_date, show_time, duration, rating) VALUES 
('Challengers', '2024-06-09', '15:00:00', 120, 7),
('Furiosa Saga Mad Max', '2024-06-09', '18:00:00', 130, 8),
('Garfield', '2024-06-10', '13:00:00', 90, 6),
('BAD BOYS: RIDE OR DIE', '2024-06-10', '20:00:00', 110, 7);

-- Wstawianie do tabeli Bilety
INSERT INTO Bilety (ticket_type, price) VALUES 
('Normalny', 15.0),
('Ulgowy', 10.0),
('Grupowy', 8.0),
('Studencki', 12.0);

-- Wstawianie do tabeli Giftcards
INSERT INTO Giftcards (giftcard_type, price) VALUES 
('Standard', 25.0),
('Premium', 50.0),
('Gold', 75.0),
('Platinum', 100.0);