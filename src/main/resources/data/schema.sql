
CREATE TABLE bar (
    id BIGINT AUTO_INCREMENT PRIMARY KEY,
    item_name VARCHAR(255),
    price DOUBLE
);

CREATE TABLE Users (
id BIGINT AUTO_INCREMENT PRIMARY KEY,
email VARCHAR(255),
name VARCHAR(255),
surname VARCHAR(255),
password_hash VARCHAR(255),
phone VARCHAR(255),
points INT
);

CREATE TABLE MovieHistory (
    id BIGINT AUTO_INCREMENT PRIMARY KEY,
    email VARCHAR(255),
    name VARCHAR(255),
    date_added TIMESTAMP
);
CREATE TABLE Sala (
    id BIGINT AUTO_INCREMENT PRIMARY KEY,
    nr_krzeselka INT,
    movie VARCHAR(255),
);

CREATE TABLE Tickets (
    ticket_id BIGINT AUTO_INCREMENT PRIMARY KEY,
    user_mail VARCHAR(255),
    seat_number INT,
    purchase_date TIMESTAMP,
    ticket_type VARCHAR(255),
    movie VARCHAR(255)
);

CREATE TABLE Repertuar (
    id BIGINT AUTO_INCREMENT PRIMARY KEY,
    movie_name VARCHAR(255),
    show_date DATE,
    show_time TIME,
    duration INT,
    rating INT
);

CREATE TABLE Bilety (
    id BIGINT AUTO_INCREMENT PRIMARY KEY,
    ticket_type VARCHAR(255),
    price DOUBLE
);

CREATE TABLE Giftcards (
    id BIGINT AUTO_INCREMENT PRIMARY KEY,
    giftcard_type VARCHAR(255),
    price DOUBLE
);
mvn spring-boot:run