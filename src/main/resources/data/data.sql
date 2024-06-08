
INSERT INTO bar (item_name, price) VALUES ('Popcorn', 5.50);
INSERT INTO bar (item_name, price) VALUES ('Nachos', 12.00);
INSERT INTO bar (item_name, price) VALUES ('Cola', 100.00);
INSERT INTO bar (item_name, price) VALUES ('Sok', 10.00);

--Tabela users
INSERT INTO Users (email, name, surname, password_hash, phone, points) VALUES
('john.doe@example.com', 'John', 'Doe', '0dee3eaf26a48e6447042f7beb357e9780452bb85eebb3f550fe32a775779865', '123456789', 40),
('jane.smith@example.com', 'Jane', 'Smith', '0dee3eaf26a48e6447042f7beb357e9780452bb85eebb3f550fe32a775779865', '987654321', 20),
('michael.jones@example.com', 'Michael', 'Jones', '0dee3eaf26a48e6447042f7beb357e9780452bb85eebb3f550fe32a775779865', '555666777', 0),
('emily.davis@example.com', 'Emily', 'Davis', '0dee3eaf26a48e6447042f7beb357e9780452bb85eebb3f550fe32a775779865', '444555666', 40),
('daniel.brown@example.com', 'Daniel', 'Brown', '0dee3eaf26a48e6447042f7beb357e9780452bb85eebb3f550fe32a775779865', '333444555', 50),
('jan.kowalski@example.com', 'Jan', 'Kowalski', '0dee3eaf26a48e6447042f7beb357e9780452bb85eebb3f550fe32a775779865', '345654345', 10);

--Tabela ratings

INSERT INTO Movie_Rating (email, name, rating, date_added) VALUES
('john.doe@example.com', 'Incepcja', 5, CURRENT_TIMESTAMP),
('john.doe@example.com', 'Interstellar', 4, CURRENT_TIMESTAMP),
('jane.smith@example.com', 'Matrix', 5, CURRENT_TIMESTAMP),
('jane.smith@example.com', 'Avengers: Koniec gry', 4, CURRENT_TIMESTAMP);

--tabela history

INSERT INTO Movie_History (email, name, date_added) VALUES
('john.doe@example.com', 'Incepcja',  CURRENT_TIMESTAMP),
('john.doe@example.com', 'Interstellar', CURRENT_TIMESTAMP),
('jane.smith@example.com', 'Matrix',  CURRENT_TIMESTAMP),
('jane.smith@example.com', 'Avengers: Koniec gry', CURRENT_TIMESTAMP);