
INSERT INTO bar (item_name, price) VALUES ('Popcorn', 5.50);
INSERT INTO bar (item_name, price) VALUES ('Nachos', 12.00);
INSERT INTO bar (item_name, price) VALUES ('Cola', 100.00);
INSERT INTO bar (item_name, price) VALUES ('Sok', 10.00);

--Tabela users
INSERT INTO Users (email, name, surname, password_hash, phone, points) VALUES
('john.doe@example.com', 'John', 'Doe', 'hashedpassword1', '123456789', 40),
('jane.smith@example.com', 'Jane', 'Smith', 'hashedpassword2', '987654321', 20),
('michael.jones@example.com', 'Michael', 'Jones', 'hashedpassword3', '555666777', 0),
('emily.davis@example.com', 'Emily', 'Davis', 'hashedpassword4', '444555666', 40),
('daniel.brown@example.com', 'Daniel', 'Brown', 'hashedpassword5', '333444555', 50),
('jan.kowalski@example.com', 'Jan', 'Kowalski', 'hashedpassword6', '345654345', 10);

--Tabela ratings